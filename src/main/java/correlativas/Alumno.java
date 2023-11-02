package correlativas;

import java.util.List;
import java.util.ArrayList;

public class Alumno {
	private String legajo;
	private String nombre;
	private List<Materia> materiasAprobadas;
	
	public Alumno(String legajo, String nombre) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.materiasAprobadas = new ArrayList<Materia>();
	}
	
	
	public String getLegajo() {
		return legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	
	public void addMateriasAprobadas(Materia materia) {
		this.materiasAprobadas.add(materia);
	}
	

}
