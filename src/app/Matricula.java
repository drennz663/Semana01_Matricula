package app;

import java.util.ArrayList;

public class Matricula {
	
	Estudiante estudiante;
	ArrayList<Curso> cursos;
	
	public Matricula(Estudiante estudiante) {	
		
		this.estudiante  = estudiante;
		cursos = new ArrayList<Curso>();
	}
	
	
	public void agregarCurso(Curso curso) {
	//se debe evitar agregar dos veces un mismo curso	
		for (Curso c: cursos) {
			if(c.codigo.equals(curso.codigo)) {
				System.out.println("Curso ya matriculado");
				return;
			}
		}
		
		int creditosActuales = 0;
		for (Curso c : cursos) {
			creditosActuales += c.creditos;
		}
		int totalProyectado = creditosActuales + curso.creditos;
		
		if(totalProyectado > 22) {
			System.out.println("Solo es posible agregar 22 creditos");
				return;
		}
		//Si el curso no ha sido agregado
		cursos.add(curso);
		System.out.println("Curso agregado correctamente");
	}
	
	
	public void eliminarCurso(String codigo) {
		for (Curso c: cursos) {
			if(c.codigo.equalsIgnoreCase(codigo)) {
				cursos.remove(c);
				System.out.println("Curso eliminado correctamente");
				return;
			}
		}
		
		System.out.println("Curso no encontrado");
	}
	
	
	public void mostrarMatricula() {
		System.out.println();
		//paso 1 mostrar datos del estudiante
		estudiante.mostrarDatos();
		
		
		int totalcreditos = 0;
		
		//paso 2 mostrar los cursos matriculados
		for(int i=0; i<cursos.size(); i++) {
			Curso curso = cursos.get(i);
			curso.mostrarCurso();
			totalcreditos = totalcreditos + curso.creditos;
		}
		
		if(cursos.size() == 0) {
			System.out.println("\nNO EXISTEN CURSOS MATRICULADOS");
			return;
		}
		System.out.println("\n************CURSOS MATRICULADOS************");
		//mostrar resumen de matricula total de cursos y creditos
		System.out.println("Total de cursos: " + cursos.size());
		System.out.println("Total de creditso: " + totalcreditos);

	}
	
	
	public void buscarCursoMatriculado(String codigo) {
		for (Curso c: cursos) {
			if(c.codigo.equalsIgnoreCase(codigo)) {
				c.mostrarCurso();
				return;
			}
		}
		
		System.out.println("Curso no encontrado en la matrícula");
	}
	
	
	public void verificarCantCursosMatriculados() {
		for(int i=0; i<cursos.size(); i++) {
		}
		if(cursos.size() == 0) {
			System.out.println("\nAun no tienes cursos matriculados");
			return;
		}
		System.out.println("\nTotal de cursos matriculados: " + cursos.size());
	}
	
}

