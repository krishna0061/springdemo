package com.springdemo.classes;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Costumer_Need_DI_Employee {

	public static void main(String[] args) {
		
		//creating application context for DI 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee sdi = (Employee) context.getBean("namedi"); 
		
		sdi.displayName();
		
		//close the context
			context.close();
		

	}

}
