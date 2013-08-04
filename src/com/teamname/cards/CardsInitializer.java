package com.teamname.cards;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CardsInitializer implements WebApplicationInitializer {
	
	private final Logger logger = Logger.getLogger(this.getClass().getName()) ;

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("FICK DICH!!");
		logger.log(Level.INFO, "WebApplicationInitializer started");
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(Config.class);

		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/steam/*");
		servlet.setLoadOnStartup(1);
	}
	
	

}
