package app;

public class Curso {
	
	String codigo;
	String nombre;
	int    creditos;
	
	public Curso(String codigo, String nombre, int creditos) {
		
		this.codigo   = codigo;
		this.nombre   = nombre;
		this.creditos = creditos;
	}
	
	
	public void mostrarCurso() {
		System.out.println(codigo + " - " + nombre + " (" + creditos + " créditos)");
	}
}

