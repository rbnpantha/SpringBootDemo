package rbn.edu.apartment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	@RequestMapping
	public String getUserProfile(Model model){
		return "userProfile";
	}
}
