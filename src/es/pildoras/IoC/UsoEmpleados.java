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

