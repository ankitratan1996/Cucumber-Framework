 package com.flamingo.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	private WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HRMOrangeLoginpage getHRMOrangeLoginpage()
	{
		return 	new HRMOrangeLoginpage(driver);
	}
}
