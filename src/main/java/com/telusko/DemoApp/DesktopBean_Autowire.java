package com.telusko.DemoApp;


import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desktop")
@Scope("prototype")
public  class DesktopBean_Autowire implements Computer {
	private String desktopName = null;
	private String laptopName = null;
	
	public DesktopBean_Autowire() {
		this.desktopName="DefaultDesktopEveryDeveloperGets";
	}	
	
	public String getDesktopName() {return desktopName;}
	public void setDesktopName(String desktopName) {this.desktopName=desktopName;}
	public String getLaptopName() {return laptopName;}
	public void setLaptopName(String laptopName) {this.laptopName=laptopName;};

	@Override
	public void compile() {
		System.out.println("Compiling Using Desktop.");		
	}

}
