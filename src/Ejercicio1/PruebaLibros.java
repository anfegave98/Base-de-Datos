package Ejercicio1;

import javax.swing.JOptionPane;

public class PruebaLibros {
	public static void main(String[] args) {
		ConjuntoLibros Libros= new ConjuntoLibros();
		boolean salir=false;
		while(salir!=true){
		int opciones=0;
		System.out.println("1. Agregar Libro          ");
		System.out.println("2. Imprimir Libros        ");
		System.out.println("3. Calificacion Mayor     ");
		System.out.println("4. Calificacion Menor     ");
		System.out.println("5. Salir                  ");
		opciones=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que desea: "));
		switch(opciones){
			case 1:
			 Libros.agregarLibro();
				break;
			case 2:
				Libros.imprimirLibros();
				break;
			case 3:
				Libros.mayorPuntaje();
				break;
			case 4:
				Libros.menorPuntaje();
				break;
			case 5:
				salir=true;
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
		
	}

	}
}
