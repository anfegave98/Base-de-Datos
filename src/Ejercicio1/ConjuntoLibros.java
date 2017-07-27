package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class ConjuntoLibros {
	public Libros Libros[];

	public ConjuntoLibros() {
		this.Libros = new Libros[2];
		for (int i = 0; i < Libros.length; i++) {
			Libros[i] = new Libros();
		}
	}

	public void agregarLibro() {
		for (int i = 0; i < Libros.length; i++) {
			String titulo = JOptionPane.showInputDialog("Digite el nombre del libro:");
			String autor = JOptionPane.showInputDialog("Digite el autor del libro:");
			int paginas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de paginas del libro:"));
			int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion del libro:"));
			Libros[i] = new Libros(titulo, autor, paginas, calificacion);
		}
	}

	public void imprimirLibros() {
		String librosAux = " Libros \n Titulo -- Autor --  Paginas -- Calificacion\n";
		for (int i = 0; i < Libros.length; i++) {
			librosAux += Libros[i].getTitulo() + ", " + Libros[i].getAutor() + ", " + Libros[i].getPaginas() + ", "
					+ Libros[i].getCalificacion() + " \n";
		}
		System.out.println(librosAux);
	}

	public void mayorPuntaje() {
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i = 0; i < Libros.length; i++) {
			int aux = Libros[i].getCalificacion();
			x.add(aux);
		}
		x.sort(Comparator.naturalOrder());
		System.out.println(x.get(x.size()-1));

		for(int j=0;j<Libros.length;j++){
			if(Libros[j].getCalificacion()==x.get(x.size()-1)){
				System.out.println( Libros[j].getTitulo() + ", " + Libros[j].getAutor() + ", " + Libros[j].getPaginas() + ", "
						+ Libros[j].getCalificacion() + " \n");
			}
		}
		
	}

	public void menorPuntaje() {
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i = 0; i < Libros.length; i++) {
			int aux = Libros[i].getCalificacion();
			x.add(aux);
		}
		x.sort(Comparator.naturalOrder());
		for (int j = 0; j < Libros.length; j++) {
			if (Libros[j].getCalificacion() == x.get(0)) {
				System.out.println(Libros[j].getTitulo() + ", " + Libros[j].getAutor() + ", " + Libros[j].getPaginas()
						+ ", " + Libros[j].getCalificacion() + " \n");
			}
		}
	}

}
