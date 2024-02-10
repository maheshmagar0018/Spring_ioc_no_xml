package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value(value = "101")
	int id;
	@Value(value = "Mahesh")
	String name;
	
	public void details()
	{
		System.out.println(id);
		System.out.println(name);
	}

}
