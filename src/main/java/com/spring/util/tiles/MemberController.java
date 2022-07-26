package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")

public class MemberController {
	
	@RequestMapping(value="/cart", method=RequestMethod.GET)
	public ModelAndView cart() {
		return new ModelAndView("/cart");
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public ModelAndView loginForm() {
		return new ModelAndView("/loginForm");
	}

	@RequestMapping(value="/memberDetail", method=RequestMethod.GET)
	public ModelAndView memberDetail() {
		return new ModelAndView("/memberDetail");
	}
	
	@RequestMapping(value="/myPage", method=RequestMethod.GET)
	public ModelAndView myPage() {
		return new ModelAndView("/cart");
	}


}
