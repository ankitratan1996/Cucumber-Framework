package com.flamingo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flamingo.framework.Elements;


public final class HRMOrangeLoginpage {
	
	private WebDriver driver;
	
	public HRMOrangeLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@name=\"username\"]")
	public  static WebElement userNametextbox;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	public  static WebElement passwordtextbox;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	public   static WebElement submitbutton;
	
	@FindBy(xpath="//*[@class=\"orangehrm-login-forgot\"]/p")
	public  static WebElement forgetpassword;
	
	public  void enteruserName(String username)
	{
		Elements.TypeTextIfElementPresent(userNametextbox, username);
	}
	public  void enterpassword(String password)
	{
		Elements.TypeTextIfElementPresent(passwordtextbox, password);
	}
	public  void presssubmit()
	{
		Elements.clickOnlyIfElementPresent(submitbutton);
	}
	public  void pressforgetpassword()
	{
		Elements.clickOnlyIfElementPresent(forgetpassword);
	}
	
}
