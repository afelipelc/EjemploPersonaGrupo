
public class MainClass {
	public static void main(String[] args){
		//crear objeto profesor
		Profesor profe1 = new Profesor();
		profe1.setNoEmpleado(305);
		profe1.setNombre("Felipe");
		profe1.setApellidos("Cortés");
		profe1.setEdad(29);
		
		//Profesor no contiene un constructor que pide 2 parametros
		//como lo hace la clase Persona
		//Profesor profe2 = new Profesor("Pepe","Perez");
		
		//Crear objeto Grupo
		Grupo gp1 = new Grupo();
		gp1.setIdGrupo(254);
		gp1.setProfesor(profe1); //realizando la asociacion por agregacion
		//los objetos se han creado por separado y solo se asocian por REFERENCIA

		
		//Si fuese por VALOR seria asi:
		//gp1.setProfesor(new Profesor());
		
		//acceder al objeto asociado, en este caso, Profesor que esta en Grupo
		System.out.println("El id del grupo es " + gp1.getIdGrupo() + " El profesor a cargo \nse llama " + gp1.getProfesor().getNombre());
		
	}
}
