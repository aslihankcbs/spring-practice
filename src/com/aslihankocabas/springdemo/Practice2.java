package com.aslihankocabas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myHockeyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}

}
