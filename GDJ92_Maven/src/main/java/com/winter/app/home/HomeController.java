package com.winter.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void home() {
		System.out.println("home");
	}
}
