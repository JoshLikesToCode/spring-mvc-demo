package com.joshlikestocode.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		// create a new student object
		Student theStudent = new Student();
		// add that student object as a model attribute
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " " + theStudent.getFavoriteLanguage() + " " + theStudent.getFavoriteOS());
		return "student-confirmation";
	}
}
