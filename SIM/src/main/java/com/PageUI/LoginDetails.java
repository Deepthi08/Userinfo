package com.PageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDetails {
	@FindBy(id="username") WebElement UserName;
	@FindBy(id="password") WebElement Password;
	@FindBy(id="btnsubmit") WebElement Login;
	
	public LoginDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login() 
	{
		UserName.clear();
		Password.clear();
		UserName.sendKeys("admin");
		Password.sendKeys("master");
		Login.click();
		  

	}
	

}
