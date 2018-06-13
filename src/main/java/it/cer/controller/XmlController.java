package it.cer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class XmlController extends AbstractController{

	//http://localhost:8080/PivotalCert/xmlC
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("DDD! id:");
		return new ModelAndView("return");
	}

}
