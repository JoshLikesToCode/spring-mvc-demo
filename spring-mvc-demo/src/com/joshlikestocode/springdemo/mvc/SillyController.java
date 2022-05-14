package com.joshlikestocode.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	@RequestMapping("/showForm") // trying to break HelloWorldController's /showForm
	public String displayTheForm()
	{
		return "silly";
	}
}
