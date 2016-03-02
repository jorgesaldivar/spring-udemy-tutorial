package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.dao.Offer;
import com.spring.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {

	@Autowired
	private OffersDAO offersDao;

	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}
	
	public List<Offer> getCurrent() {
		return offersDao.getOffers();
	}
	
}
