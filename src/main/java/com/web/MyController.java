package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	 public String home()
	 {
	  return "home";
	 }
	@RequestMapping("/req1")
	 public ModelAndView output(@RequestParam("fnumber") Integer fnumber,
			 @RequestParam("snumber") Integer snumber,
			 @RequestParam("button") String button)
	 {
		String result="";
		if(button.equals("add"))
			result+="addition is "+(fnumber+snumber);
		else if(button.equals("sub"))
			result+="Subtraction is "+(fnumber-snumber);
		else if(button.equals("mul"))
			result+="Multiplication is "+(fnumber*snumber);
		else if(button.equals("div"))
			result+="Division is "+(fnumber/snumber);
		else
			result+="Percentage is "+(fnumber%snumber);
	  return new ModelAndView("result","result",result) ;
	 }
	
	
}
