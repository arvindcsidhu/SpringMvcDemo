package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student thestudent = new Student();
		
		model.addAttribute("student", thestudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		
		System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

}
