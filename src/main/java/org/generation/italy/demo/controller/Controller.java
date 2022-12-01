package org.generation.italy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/test")
	public String getHome(Model model) {
		
		
		
		return "index";
		
	}
	
}
