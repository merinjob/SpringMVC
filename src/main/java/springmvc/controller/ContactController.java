package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String email=request.getParameter("email");
//		System.out.println("Email is : "+email);
//	return"";
//
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			// Fetching data
			@RequestParam(name="email", required=true) String userEmail, 
			@RequestParam("name" )String userName, 
			@RequestParam("password")String userPassword, Model model){
		System.out.println("User Email is: "+userEmail);
		System.out.println("User Name is: "+userName);
		System.out.println("User Password is: "+userPassword);
		
		// Process -- it will print them on the view page
		model.addAttribute("uname", userName);
		model.addAttribute("uemail", userEmail);
		model.addAttribute("upassword", userPassword);
		
		return "success";
	}
}
