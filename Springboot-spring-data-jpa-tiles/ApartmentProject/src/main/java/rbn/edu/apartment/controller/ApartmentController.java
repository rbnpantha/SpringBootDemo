package rbn.edu.apartment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rbn.edu.apartment.domain.Apartment;
import rbn.edu.apartment.service.ApartmentService;

@Controller
@RequestMapping("/apartment")
//@RequestMapping
public class ApartmentController {

	@Autowired
	ApartmentService apartmentService;
	
	@RequestMapping(value={"/","findAll"}, method=RequestMethod.GET)
	public String getAllApartments(Model model){
		model.addAttribute("apartmentList",apartmentService.getAllApartment());
		return "apartmentsList";
		
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addApartment(@ModelAttribute("apartment") Apartment apartment, Model model){
		
		return "addApartment";
		
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addApartment(@ModelAttribute Apartment apartment){
		
		apartmentService.saveApartment(apartment);
		return "redirect:/home";
		
	}
	
	@RequestMapping(value="/find/{id}", method=RequestMethod.GET)
	public String findApartmentById(Model model){
		
		return "findApartment";
		
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public String updateApartment(){
		
		return "redirect:/findAll";
		
	}
	
	
	
}
