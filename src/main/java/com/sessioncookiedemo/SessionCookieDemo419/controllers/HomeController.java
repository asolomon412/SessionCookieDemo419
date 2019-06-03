package com.sessioncookiedemo.SessionCookieDemo419.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView homePage(HttpServletResponse response) {
		Cookie cookie = new Cookie("usercookie", "antonella");
		response.addCookie(cookie);
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
		
		// this is showing how we can get access to the JSessionID
		String id = session.getId();
		ModelAndView mv = new ModelAndView("count-test", "test", count);
		mv.addObject("sessID", id);
		
		return mv;
	}
	
	@RequestMapping("cookie-test")
	public ModelAndView showCookie(@CookieValue("usercookie") String username) {
		
		return new ModelAndView("cookie-test", "user", username);
	}
}
