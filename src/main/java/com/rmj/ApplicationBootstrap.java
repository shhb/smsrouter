package com.rmj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"com.rmj.*"})
public class ApplicationBootstrap extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBootstrap.class,args);

	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationBootstrap.class);
	}

}
