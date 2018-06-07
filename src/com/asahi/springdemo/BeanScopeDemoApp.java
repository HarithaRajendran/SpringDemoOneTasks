package com.asahi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrive the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are equal object
		
		Boolean result = theCoach == alphaCoach;
		System.out.println("The result is "+result);
		
		System.out.println("The memory of coach "+theCoach);
		
		System.out.println("The memory of alpha "+alphaCoach);
		
		context.close();
		
	}

}
