package it.cer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
/**
 * Questo controller non usa lo StereoType ma implementa AbstractController per essere definito come Controller.
 * 
 * Questo bean è stato censito sul file di configurazione mvc-config.xml ed è stato anche censito
 * un bean architetturale org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping.
 * 
 * Questa classe prende il controllo per quelle request che iniziano con il nome della classe (dove la prima lettera in lowercase). Mi sembra che devono essere definite almento tre lettere. 
 * Esempio:
 * http://localhost:8080/PivotalCert/xmlC OK
 * http://localhost:8080/PivotalCert/xmlx OK
 * http://localhost:8080/PivotalCert/xm   NON FUNZIONA
 * 
 * Fonte: https://www.tutorialspoint.com/springmvc/springmvc_controllerclassnamehandlermapping.htm
 * 
 * @author Viola_N
 *
 */
public class XmlController extends AbstractController{

	//http://localhost:8080/PivotalCert/xmlC
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("DDD! id:");
		return new ModelAndView("return");
	}

}
