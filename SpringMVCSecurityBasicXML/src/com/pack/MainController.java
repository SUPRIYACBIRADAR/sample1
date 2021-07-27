package com.pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		return new ModelAndView("index");
	}
		
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	  public ModelAndView goToAdmin() {
		 
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Administrator Page");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}
}
