package com.joshlikestocode.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class HomeController {

	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu"; // config file will add prefix & suffix
	}
}
