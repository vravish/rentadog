package com.cloudgatetech.rentadog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class RequestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView request() {
		return new ModelAndView("request", "command", new Request());
	}

	@RequestMapping(value = "/submitRequest", method = RequestMethod.POST)
	public String addRequest(@ModelAttribute("SpringWeb") Request request,
			ModelMap model) {
//		System.out.println("Got to the post request!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!"
//				+ "\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
				//System.out.println statements are visible in catalina.out

		model.addAttribute("userid", request.getUserid());
		model.addAttribute("breed", request.getBreed());
		model.addAttribute("start", request.getStart());
		model.addAttribute("end", request.getEnd());
		
		// TODO: fix database access code (JDBC)
//		ApplicationContext context = 
//	             new ClassPathXmlApplicationContext("beans.xml");
//		
//		RequestJDBCTemplate requestJDBCTemplate = 
//			      (RequestJDBCTemplate)context.getBean("requestJDBCTemplate");
//		
//		requestJDBCTemplate.create(request.getUserid(), request.getBreed(), request.getStart(), request.getEnd());

		return "result";
	}
}
