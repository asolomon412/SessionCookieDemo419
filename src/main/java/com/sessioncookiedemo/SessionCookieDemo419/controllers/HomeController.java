package com.sessioncookiedemo.SessionCookieDemo419.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("index", "pagetitle", "Home");
	}

	@RequestMapping("counter")
	public ModelAndView sessionCounter(HttpSession session) {
		
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		
		int count = (int) session.getAttribute("counter");
		count++;
		session.setAttribute("counter", count);
		return new ModelAndView("count-test", "test", count);
	}
}
