package com.beingjavaguys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("home")
	public String getHome() {
		return "home";
	}

	@RequestMapping("login")
	public ModelAndView getLoginForm(
			@RequestParam(required = false) String authfailed, String logout) {
		System.out.println("getLoginForm");
		String message = "";
		if (authfailed != null) {
			message = "Invalid username of password, try again !";
		} else if (logout != null) {
			message = "Logged Out successfully, login again to continue !";
		}
		System.out.println("Debug @ stmt :: authfailed"+authfailed);
		System.out.println("Debug @ stmt :: logout"+logout);
		return new ModelAndView("login", "message", message);
	}

	@RequestMapping("profile")
	public String geProfilePage() {
		return "profile";
	}

}
