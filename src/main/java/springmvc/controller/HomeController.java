package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Knox");
		model.addAttribute("id",002);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Cole");
		friends.add("Xander");
		friends.add("Ronan");
		model.addAttribute("f", friends);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		//Creatinf model & view object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name","Elsa Aiden");
		modelAndView.addObject("rno",591059);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
