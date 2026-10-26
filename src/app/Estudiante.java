package app;

public class Estudiante {
	
	String codigo;
	String nombre;
	String carrera;
	
	public Estudiante(String codigo, String nombre, String carrera) {
		
		this.codigo  = codigo;
		this.nombre  = nombre;
		this.carrera = carrera;
	}
	
	//creacion del metodo mostrarDatos
	public void mostrarDatos() {
		System.out.println("Codigo:"  + codigo);
		System.out.println("Nombre:"  + nombre);
		System.out.println("Carrera:" + carrera);
		
	}
}
