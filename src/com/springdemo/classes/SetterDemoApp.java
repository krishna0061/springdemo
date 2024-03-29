package com.springdemo.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// call our new methods for literals
		System.out.println(theCoach.getEmailaddress());
		System.out.println(theCoach.getTeam());
		

		// close the context
		context.close();
	}

}
