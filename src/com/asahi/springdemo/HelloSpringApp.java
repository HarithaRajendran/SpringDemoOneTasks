package com.asahi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring config file // .xml file
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml");
			
		//retrive bean from spring container
			Coach theCoach = context.getBean("myCoach",Coach.class);
			
		//call the method on the bean object
			System.out.println(theCoach.getDailyWorkout());
			
		//call the DEPENDENDY METHODS on the bean object
			System.out.println(theCoach.getDailyFortune());
			
		//Close the context object
			context.close();
	}

}
