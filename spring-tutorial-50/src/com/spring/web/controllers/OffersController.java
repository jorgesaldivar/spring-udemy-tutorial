package com.spring.web.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.dao.Offer;
import com.spring.web.service.OffersService;

@Controller
public class OffersController {

	/*
	 * @RequestMapping("/") public String showHome(HttpSession session) {
	 * session.setAttribute("name", "barris"); return "home"; }
	 */

	/*
	 * @RequestMapping("/") public ModelAndView showHome() {
	 * 
	 * ModelAndView mv = new ModelAndView("home"); Map<String, Object> model =
	 * mv.getModel(); model.put("name", "barris"); return mv; }
	 */

	@Autowired
	private OffersService offersService;

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id) {
		System.out.println("ID: " + id);
		return "home";
	}
	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		model.addAttribute("name", "model");
		return "offers";
	
	}
	
	@RequestMapping("/createoffer")
	public String createOffer() {

		return "createoffer";
	
	}

}
