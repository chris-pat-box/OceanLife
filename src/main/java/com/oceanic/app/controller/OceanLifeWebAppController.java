package com.oceanic.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OceanLifeWebAppController {
	
	@RequestMapping(value= "/home")
	public String homePage() {
		return "home.jsp";
	}
	
	@RequestMapping(value = "/contact_us")
	public String contactPage() {
		return "contact_us.jsp";
	}
}
