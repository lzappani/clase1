package correlativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String codigoMateria;
	private String nombre;
	private List<Materia> correlativas;
	
	public Materia(String codigoMateria, String nombre) {
		this.codigoMateria = codigoMateria;
		this.nombre = nombre;
		this.correlativas = new ArrayList<Materia>();
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}
	
	public void addCorrelativa(Materia materia) {
		this.correlativas.add(materia);
	}
	
	
}
