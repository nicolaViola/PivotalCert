package it.cer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping(value = "/users")
public class MyController{
	
//  http://localhost:8080/PivotalCert/users/list
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		System.out.println("DDD!");
		//return "users/list";
		
		model.addAttribute("msg", "XmlViewResolver Demoxxxxxxxxxxxxx");
		return "list2";
	}
	
	
	//  http://localhost:8080/PivotalCert/users/test/105
	@RequestMapping(value = "/test/{\\d*}", method = RequestMethod.GET)
	public String show(Model model) {
		System.out.println("DDD! id:");
		return "users/list";
	}
	
	//  http://localhost:8080/PivotalCert/users/showUser?userId=105
	@RequestMapping(value = "/showUser", method = RequestMethod.GET)
	public String showxx(Model model, @RequestParam(value = "userId", required = true) Long userId) {
		System.out.println("DDD! id:");
		return "users/list";
	}
	
	
	//  http://localhost:8080/PivotalCert/users/105
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public ModelAndView showx(Model model, @PathVariable("userId") Long userId) {
		System.out.println("DDD! id:");
		//return "test";
		return new ModelAndView("users/list");
	}
	
	
	
//  http://localhost:8080/PivotalCert/users/xml
	@RequestMapping(value = "/xml", method = RequestMethod.GET)
	public String xXml(Model model) {
		System.out.println("DDD!");
		model.addAttribute("msg", "XmlViewResolver Demo");
		return "list2";
	}


	


}
