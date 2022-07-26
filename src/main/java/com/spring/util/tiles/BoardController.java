package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class BoardController {
	
	@RequestMapping(value="/bList" , method=RequestMethod.GET)
	public ModelAndView bList() {
		return new ModelAndView("/bList");
	}
	@RequestMapping(value="/bWrite" , method=RequestMethod.GET)
	public ModelAndView bWrite() {
		return new ModelAndView("/bWrite");
	}
	@RequestMapping(value="/bUpdate" , method=RequestMethod.GET)
	public ModelAndView bUpdate() {
		return new ModelAndView("/bUpdate");
	}
	@RequestMapping(value="/bDelete" , method=RequestMethod.GET)
	public ModelAndView bDelete() {
		return new ModelAndView("/bDelete");
	}
	
	
	

}
