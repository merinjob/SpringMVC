package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	//RequestParam Explained ----------(1)
	
//	@RequestMapping("/contact")
//	public String showForm() {
//		return "contact";
//	}
//
//	// Printing using httpservlet
////	@RequestMapping(path = "/processform", method = RequestMethod.POST)
////	public String handleForm(HttpServletRequest request) {
////		String email=request.getParameter("email");
////		System.out.println("Email is : "+email);
////	return"";
////
////	}
//
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			// Fetching data
//			@RequestParam(name="email", required=true) String userEmail, 
//			@RequestParam("name" )String userName, 
//			@RequestParam("password")String userPassword, 
//			Model model){
//
//	
//		System.out.println("User Email is: "+userEmail);
//		System.out.println("User Name is: "+userName);
//		System.out.println("User Password is: "+userPassword);
//		
//		
//		// Process -- it will print them on the view page
//		model.addAttribute("uname", userName);
//		model.addAttribute("uemail", userEmail);
//		model.addAttribute("upassword", userPassword);
//		
//		return "success";
//	}
//}

	// --------------------------------------------------------------------------------
	// Using only one model attribute instead of 3 ------(2)
	
//	@RequestMapping("/contact")
//	public String showForm() {
//		return "contact";
//	}
//	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			// Fetching data
//			@RequestParam(name="email", required=true) String userEmail, 
//			@RequestParam("name" )String userName, 
//			@RequestParam("password")String userPassword, Model model){
//		
//
////		Using model to replace these 3 lines
//
//		User user=new User();
//		user.setEmail(userEmail);
//		user.setName(userName);
//		user.setPassword(userPassword);
//		
//		System.out.println(user);
//		
//		
//		model.addAttribute("user",user);
//		return "success";
//	}
	
	// --------------------------------------------------------------------------------
	
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonForModel(Model m) {
		m.addAttribute("Header","Coding Lessons");
		m.addAttribute("desc", "Welcome Programmers...");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header","Coding Lessons");
//		m.addAttribute("desc", "Welcome Programmers...");
		System.out.println("Creating Form");
		return "contact";
	}
	
	// Instead of  fetching data and setting the data we use model attribute annotation-- simplify the code
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		
		
		
//		model.addAttribute("Header","Coding Lessons");
//		model.addAttribute("desc", "Welcome Programmers...");
		
		System.out.println(user);
		
		if(user.getName().isBlank()) {
			return "redirect:/contact";
		}
		int createdUser=this.userService.createUser(user);
		System.out.println("Form submitted");
		model.addAttribute("msg","User created with id "+createdUser);
		return "success";
	}
	
}
