package org.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Employee_Driver {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Project_configuration.class);
		Employee employee = context.getBean(Employee.class, "employee");
		employee.details();
		
	}

}
