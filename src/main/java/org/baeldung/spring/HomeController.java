package org.baeldung.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/homepage.html")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	    //  model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "homepage";
	   }
}
