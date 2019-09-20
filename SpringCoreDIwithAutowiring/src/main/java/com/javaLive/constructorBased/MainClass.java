package com.javaLive.constructorBased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Room room = (Room) context.getBean("room3");
		Student student= (Student) context.getBean("allotedTo3");
		System.out.println(student.toString());
		System.out.println(room);
		context.registerShutdownHook();
	}
}
