package com.javaLive.byType;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Room room = (Room) context.getBean("room2");
		System.out.println(room);
		context.registerShutdownHook();
	}
}
