package com.weatherZone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}
	
//	@RequestMapping("/index")
//	public ModelAndView logonno5falcon() {
//		return new ModelAndView("index");
//	}
//	
//	@RequestMapping("/console")
//	public ModelAndView console(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
//		ModelAndView mav = new ModelAndView("redirect:/index");
//		return mav;
//	}
	

	
	
}
