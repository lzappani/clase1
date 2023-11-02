package correlativas;

public class Main {

	public static void main(String[] args) {
		
		Materia matematica1 = new Materia("1", "Matematica 1");
		Materia proyecto = new Materia("2", "Proyecto");
		Materia matematica2 = new Materia("3", "Matematica 2");
		matematica2.addCorrelativa(matematica1);
		matematica2.addCorrelativa(proyecto);
		
		Alumno leandro = new Alumno("11111", "Leandro");
		Alumno juan = new Alumno("11112", "Juan");
		juan.addMateriasAprobadas(matematica1);
		Alumno pedro = new Alumno("11113", "Pedro");
		pedro.addMateriasAprobadas(matematica1);
		pedro.addMateriasAprobadas(proyecto);
		
		Inscripcion iLeandroMatematica1 = new Inscripcion("123", leandro, matematica1);
		Inscripcion iLeandroMatematica2 = new Inscripcion("124", leandro, matematica2);
		
		Inscripcion iJuanMatematica2 = new Inscripcion("125", juan, matematica2);
		Inscripcion iPedroMatematica2 = new Inscripcion("126", pedro, matematica2);
		
		
		
		System.out.println(iLeandroMatematica1.getCodigoInscripcion() + "> " + iLeandroMatematica1.aprobada());
		System.out.println(iLeandroMatematica2.getCodigoInscripcion() + "> " + iLeandroMatematica2.aprobada());
		System.out.println(iJuanMatematica2.getCodigoInscripcion() + "> " + iJuanMatematica2.aprobada());
		System.out.println(iPedroMatematica2.getCodigoInscripcion() + "> " + iPedroMatematica2.aprobada());
		
		
	}

}
