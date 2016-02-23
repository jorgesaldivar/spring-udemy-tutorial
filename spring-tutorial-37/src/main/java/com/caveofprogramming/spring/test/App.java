package com.caveofprogramming.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");

		// Robot robot = (Robot)context.getBean("robot");

		// robot.speak();

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

		try {
			
			Offer offer1 = new Offer("Dave", "dave@email.com", "text");
			Offer offer2 = new Offer("Daves", "daves@email.com", "texts");
			
			List<Offer> offerList = new ArrayList<Offer>();
			offerList.add(offer1);
			offerList.add(offer2);
			
			int[] rVals = offersDao.create(offerList);
			
			for (int i : rVals) {
				System.out.println("Value" + i);
			}
			
			/*if (offersDao.create(offer1)) {
				System.out.println("Object created");
			}*/
			
			
			
			//offersDao.delete(4);
			
			List<Offer> offers = offersDao.getOffers();

			for (Offer offer : offers) {
				System.out.println(offer);
			}

			Offer offer = offersDao.getOffer(2);
			System.out.println(offer);
			
		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();
	}

}
