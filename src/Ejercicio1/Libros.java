package Ejercicio1;

public class Libros {
	public String titulo;
	public String autor;
	public int paginas;
	public int calificacion;

	public Libros(String titulo, String autor, int paginas, int calificacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas= paginas;
		this.calificacion=calificacion;
	}
	public Libros(){
		this.titulo=" ";
		this.autor=" ";
		this.paginas=0;
		this.calificacion=0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
}
