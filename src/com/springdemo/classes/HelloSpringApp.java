package com.springdemo.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		// retrieve bean from spring container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(thecoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(thecoach.getDailyFortune());
		
		
		//close the context
		context.close();

	}

}
