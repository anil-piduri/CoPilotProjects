package com.telusko.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
	  //Release 1 change test
	  ApplicationContext springContainer = SpringApplication.run(DemoAppApplication.class, args);
	  
	  //Inversion Of Control and Dependency Injection. Let SpringBoot manage beans and their lifecycle
	  DeveloperBean_DI_IOC developerBean1 = springContainer.getBean(DeveloperBean_DI_IOC.class);
	  System.out.println("Developer Default Name: "+developerBean1.getDeveloperName());
	  developerBean1.setDeveloperName("Anil");
	  developerBean1.buildProject();
	  
	  DeveloperBean_DI_IOC developerBean2 = springContainer.getBean(DeveloperBean_DI_IOC.class);
	  System.out.println("Developer Default Name: "+developerBean2.getDeveloperName());
	  developerBean2.setDeveloperName("Anand");
	  System.out.println("Bean 1 Name Is? "+developerBean1.getDeveloperName());
	  developerBean2.buildProject();
	  
	  System.out.println("Are they same beans? "+(developerBean1==developerBean2));  
	  			  
	  }

}
