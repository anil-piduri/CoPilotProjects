package com.telusko.DemoApp;

import org.springframework.stereotype.Component;

@Component
public interface Computer {
	public void compile();

	public void setLaptopName(String string);

	public String getLaptopName();
	
	public void setDesktopName(String string);
	
	public String getDesktopName();
	
}