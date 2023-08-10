package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		System.out.println("This is about url");
		return "about";
	}
}
