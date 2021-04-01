package com.gopinadh.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookingController {
	
	@Autowired
	BookingMongoRepository bookingRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("bookingList", bookingRepository.findAll());
		return "home";
	}
	
	@RequestMapping(value = "/addMember", method = RequestMethod.POST)
	public String addMember(@ModelAttribute Booking booking) {
		
		bookingRepository.save(booking);
		return "redirect:home";
	}
	
	
	

}
