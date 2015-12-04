package org.springframework.robot.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("org/springframework/robot/AutoWiring/bean/beans.xml");
    
    	Robot robot = (Robot) context.getBean("robot");
    	
    	robot.speak();
    	
    	((ClassPathXmlApplicationContext) context ).close();
    }
}
