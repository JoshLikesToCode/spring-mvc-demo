package com.joshlikestocode.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // <-- parent mapping
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm") // <-- submapping /hello/showForm
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	// a new controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		// read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		// convert data to all upper case
		theName = theName.toUpperCase();
		// create the message
		String res = "Yo! " + theName;
		// add the message to the model
		model.addAttribute("message", res);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{
		// Spring does this behind-the-scenes due to the "RequestParam("studentName") above 
		// read the request parameter from HTML form
//		String theName = request.getParameter("studentName");
		
		// convert data to all upper case
		theName = theName.toUpperCase();
		// create the message
		String res = "Hey My Friend, from V3! " + theName;
		// add the message to the model
		model.addAttribute("message", res);
		
		return "helloworld";
	}
	
	
	
}
