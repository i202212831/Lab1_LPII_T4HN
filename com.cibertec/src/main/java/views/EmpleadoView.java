package views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empleado = new EmpleadoController().createEmpleado("Vega", "Danna", 18, "F", 2600.5);
		System.out.println(empleado);
		
		//Buscar Empleado
		//String buscarEmpleado = new EmpleadoController().BuscarEmpleado(10);
		//System.out.println(buscarEmpleado);
		
		//Eliminar Empleado
		//String empleado= new EmpleadoController().EliminarEmpleado(4);
		//String empleado= new EmpleadoController().EliminarEmpleado(5);
		//System.out.println(empleado);
		
		//Actualizar Empleado
		//System.out.println(empleado);
	}

}
