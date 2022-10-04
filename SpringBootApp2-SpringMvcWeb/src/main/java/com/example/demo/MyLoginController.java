package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyLoginController {
	
	@Value("${spring.application.name}")
    String appName;
	
	@RequestMapping("home")
	//@ResponseBody 
	public String home() {
		System.out.println("In home controller");
		return "homePage";
	}
	
	@RequestMapping("login")
	public ModelAndView login(String name) {
		System.out.println("In Login controller, "+name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("appName", appName);
		mv.addObject("uname", name);
		mv.setViewName("loginPage");
		return mv;
	}
	
	@RequestMapping("logout/{name}")
	public ModelAndView logout(@PathVariable String name) {
		System.out.println("In Logout controller, "+ name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("appName", appName);
		mv.addObject("uname", name);
		mv.setViewName("logoutPage");
		return mv;
	}

}
