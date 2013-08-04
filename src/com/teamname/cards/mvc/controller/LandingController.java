package com.teamname.cards.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandingController {
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public ModelAndView welcome(){
		System.out.println("blubs");
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/{user}", method= RequestMethod.GET)
	public ModelAndView show(){
		return new ModelAndView ("overview");
	}
	
	@RequestMapping(value ="/{user}/create")
	public ModelAndView create(){
		return new ModelAndView("create");
	}
}
