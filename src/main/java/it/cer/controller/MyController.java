package it.cer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import it.cer.model.User;

@Controller
@RequestMapping(value = "/users")
public class MyController{
	
//  http://localhost:8080/PivotalCert/users/list
	//@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		System.out.println("DDD!");
		model.addAttribute("msg", "XmlViewResolver Demoxxxxxxxxxxxxx");
		
		User user = new User();
		user.setName("nicW");
		model.addAttribute("user", user);
		
		return "list2";
	}
	
	
//  http://localhost:8080/PivotalCert/users/test2/105
	@RequestMapping(value = "/test2/{id:\\d*}", method = RequestMethod.GET)
	public String show2(Long id, Model model) {
		System.out.println("DDD! id: " + id);
		return "users/list";
	}
	
	//  http://localhost:8080/PivotalCert/users/test/105
	@RequestMapping(value = "/test/{\\d*}", method = RequestMethod.GET)
	public String show(Model model) {
		System.out.println("DDD! id:");
		return "users/list";
	}
	
	//  http://localhost:8080/PivotalCert/users/showUser?userId=105
	@RequestMapping(value = "/showUser", method = RequestMethod.GET)
	public String showxx(Model model, @RequestParam(value = "userId", required = true) Long userIdXXX) {
		System.out.println("DDD! id: " + userIdXXX);
		return "users/list";
	}
	
	
	//  http://localhost:8080/PivotalCert/users/105
	@RequestMapping(value = "/{Id}", method = RequestMethod.GET)
	public ModelAndView showx(Model model, @PathVariable Long Id) {
		System.out.println("DDD! id: " + Id);
		return new ModelAndView("users/106");
	}
	
	
	
//  http://localhost:8080/PivotalCert/users/xml
	@RequestMapping(value = "/xml", method = RequestMethod.GET)
	public String xXml(Model model) {
		System.out.println("DDD!");
		model.addAttribute("msg", "XmlViewResolver Demo");
		return "list2";
	}
	
	
//  http://localhost:8080/PivotalCert/users/voidX
	@RequestMapping(value = "voidX", method = RequestMethod.GET)
	public void showvoidX() {
		System.out.println("DDD!");
	}
	
//  http://localhost:8080/PivotalCert/users/nullX
	@RequestMapping(value = "nullX", method = RequestMethod.GET)
	public String shownullX() {
		return null;
	}


	


}
