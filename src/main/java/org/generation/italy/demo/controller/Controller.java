package org.generation.italy.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/test")
	public String getHome(Model model) {
		
		String name = "Luco";
		
		model.addAttribute("name", name);
		
		return "index";
		
	}
	
}
