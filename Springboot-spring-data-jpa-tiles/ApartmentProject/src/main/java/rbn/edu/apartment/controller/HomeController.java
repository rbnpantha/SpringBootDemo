package rbn.edu.apartment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
	public String goHome(){
		System.out.println("This is home!!");
		return "homepage";
	}
	
	@RequestMapping(value={"/contact"}, method=RequestMethod.GET)
	public String getContact(){
		System.out.println("This is contact!");
		return "contactpage";
	}
}
