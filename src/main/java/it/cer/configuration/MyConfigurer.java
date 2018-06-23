package it.cer.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.XmlViewResolver;

import it.cer.controller.XmlController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"it.cer"})
public class MyConfigurer extends WebMvcConfigurerAdapter{

	@Bean
	public ControllerClassNameHandlerMapping controllerClassNameHandlerMapping() {
		return new ControllerClassNameHandlerMapping();
	}
	
	@Bean
	public XmlController xmlController() {
		return new XmlController();
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/jsp/");
		ivr.setSuffix(".jsp");
		ivr.setRequestContextAttribute("requestContext");
		return ivr;
	}
	
	
	@Bean
	public XmlViewResolver xmlViewResolver() {
		XmlViewResolver xvr = new XmlViewResolver();
		
		FileSystemResource cc = new FileSystemResource("/home/nicola/git/PivotalCert/WebContent/WEB-INF/spring-views.xml");
		cc.exists();
		xvr.setLocation(cc);
		return xvr;
	}
	
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	
	
	
	
	
	
}
