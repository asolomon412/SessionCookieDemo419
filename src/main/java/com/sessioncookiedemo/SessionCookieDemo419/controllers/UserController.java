package com.sessioncookiedemo.SessionCookieDemo419.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.sessioncookiedemo.SessionCookieDemo419.models.User;

@Controller
public class UserController {

	// Option 2
	User userNoSession = new User();

	@RequestMapping("user-details")
	public ModelAndView userInfo(HttpSession session, User user) {
		session.setAttribute("myuser", user);
		userNoSession = user;
		return new ModelAndView("user-deets", "sessionuser", user);
	}

	// you would need to research this
	@RequestMapping("user-test2")
	public ModelAndView userDetails2(@SessionAttribute(name = "myuser", required = false) User user2) {
		return new ModelAndView("user-deets2", "sessionuser", user2);
	}

	@RequestMapping("user-nosession")
	public ModelAndView userDetails3() {
		return new ModelAndView("user-deets2", "sessionuser", userNoSession);
	}

}
