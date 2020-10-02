package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		/*
		// Creacion de objetos de tipo Empleado
		
		Empleados Empleado1 = new SecretarioEmpleado(); //Una intefaz y el const pertenece a una clase que implementa dicha interf  ... Abstracción
		
//		Empleados Empleado1 = new DirectorEmpleado();
		
		
		// Uso de los objetos creados
		
		System.out.println(Empleado1.getTareas());
		
		*/
		
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); // Cargar archivo xml
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class); // Pedir el Bean
		
		System.out.println(Juan.getTareas()); // Utilizar el Bean
		
		contexto.close(); // Cerrar el xml
		
	}

} 

/*

	//--> 1

>	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

	Creamos el contexto
	Creamos un objeto o instancia de la clase ClassPathXmlApplicationContext
	Cargamos el archivo xml
	Requiere importar el paquete correspondiente
	
	
	//--> 2
	
>	Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
	
	Crea un empleado con la interfaz (abstracción)
	Obtenemos el bean con .getBean utilizando como referencia a contexto
	Recibe dos parámetros, el nombre (id) del generador y un enlace a la interfaz 
	
	
	//--> 3
	
>	System.out.println(Juan.getTareas());

	Utilizamos el método (haciendo uso del bean)

	//--> 4
	
>	contexto.close();
	
	Cerramos el xml
	
*/
	
	
	