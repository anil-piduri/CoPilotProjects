package com.telusko.DemoApp;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("laptop")
@Scope("prototype")
@Primary
public class LaptopBean_Autowire implements Computer {
	private String laptopName = null;
	
	public LaptopBean_Autowire() {
		this.laptopName="DefaultLaptopEveryDeveloperGets";
	}
	
	
	public String getLaptopName() {return laptopName;}
	public void setLaptopName(String laptopName) {this.laptopName=laptopName;}


	@Override
	public void compile() {
		System.out.println("Compiling using Laptop");		
	}


	@Override
	public void setDesktopName(String string) {	}


	@Override
	public String getDesktopName() {		
		return null;
	}

}
