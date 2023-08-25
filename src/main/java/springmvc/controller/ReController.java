package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	(1) Redirect Prefix
	
	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handler");
//		return "redirect:/enjoy";
//	}
	
//	(2) Redirect View
	
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
//	(3) HttpServletResponse ---- not completed
	
//	public String one(HttpServletResponse response) {
//	System.out.println("This is one handler");
//	try {
//		response.sendRedirect("");
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return "";
//	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is second handler");
		return "contact";
		
	}
	
	
}
