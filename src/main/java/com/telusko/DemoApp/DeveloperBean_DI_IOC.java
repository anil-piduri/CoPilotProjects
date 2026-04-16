package com.telusko.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("developer")
@Scope("prototype")
public class DeveloperBean_DI_IOC {
	private String developerName;
	@Autowired 	
	private Computer developerComputer;
	
	
	//@Autowired	
	public DeveloperBean_DI_IOC(Computer computer) {
		this.developerName="New Hire Developer, Assign Name Please";
		this.developerComputer=computer;
	}
	
	public String getDeveloperName() {
		return developerName;
	}
	
	public void setDeveloperName(String developerName) {
		this.developerName=developerName;
	}
	
	//@Autowired
	public void setComputer(Computer computer) {
		this.developerComputer=computer;
	}
	
	public void buildProject() {
		System.out.println(getDeveloperName()+" Is Working on an awesome project and needs a Computer");		
		
		  if(getDeveloperName().equals("Anil")) { developerComputer.setLaptopName("Dell"); }else
		  if(getDeveloperName().equals("Anand")) { developerComputer.setLaptopName("MacBook"); }
		  
		  //myLaptop.setLaptopName("AppleMac");
		  System.out.println("New Laptop for "+getDeveloperName()+" is: "+ developerComputer.getLaptopName());
		  
		  developerComputer.compile();
		 
	};
	
	

}
