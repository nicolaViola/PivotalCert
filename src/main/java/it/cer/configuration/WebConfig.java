package it.cer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"it.cer"})
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public InternalResourceViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp" );
		resolver.setRequestContextAttribute("requestContext");
		return resolver;
	}
	
	@Bean
	public XmlViewResolver getViewResolverXml(){
		XmlViewResolver resolver = new XmlViewResolver();
		
		resolver.setLocation(new FileSystemResource("C:/Users/Viola_n/git/PivotalCert/WebContent/WEB-INF/spring-views.xml"));
		

		resolver.setOrder(1);
		return resolver;
	}

}
/*

<bean class="org.springframework.web.servlet.view.XmlViewResolver">
<property name="location" value="/WEB-INF/spring-views.xml" />
	<property name="order" value="1" />
</bean>

*/