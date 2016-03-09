package com.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/aop/beans.xml");
		
		Object obj = context.getBean("camera");
		System.out.println(obj.getClass());
		if(obj instanceof Camera) System.out.println("true");
		
		Camera camera = (Camera)context.getBean("camera");
		
		System.out.println(camera.getClass());
		
		camera.snap();
		context.close();
	}

}
