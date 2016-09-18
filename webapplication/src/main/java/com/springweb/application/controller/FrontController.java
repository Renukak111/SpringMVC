package com.springweb.application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.application.vo.User;

@Controller
public class FrontController {
	

	
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String printWelcome(ModelMap model) {

			model.addAttribute("message", "Spring 4 MVC Hello World");
			return "hello";

		}

		@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
		public ModelAndView hello(@PathVariable("name") String name) {

			ModelAndView model = new ModelAndView();
			model.setViewName("home");
			User user = new User();
			user.setUserName(name);
			System.out.println("name"+name);
			model.addObject("tmp",user);

			return model;

		}	

	}



