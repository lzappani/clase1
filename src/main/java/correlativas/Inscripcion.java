package correlativas;

public class Inscripcion {
	private String codigoInscripcion;
	private Alumno alumno;
	private Materia materia;
	
	
	
	public Inscripcion(String codigoInscripcion, Alumno alumno, Materia materia) {
		super();
		this.codigoInscripcion = codigoInscripcion;
		this.alumno = alumno;
		this.materia = materia;
	}


	public String getCodigoInscripcion() {
		return codigoInscripcion;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public Materia getMateria() {
		return materia;
	}


	public boolean aprobada() {
		return materia.getCorrelativas()
				.stream()
				.allMatch(correlativa -> alumno
						.getMateriasAprobadas()
						.contains(correlativa));
	}
	
}
