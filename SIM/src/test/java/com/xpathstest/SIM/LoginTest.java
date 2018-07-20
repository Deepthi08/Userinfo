package com.xpathstest.SIM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageUI.LoginDetails;
import com.xpaths.SIM.Base;

public class LoginTest extends Base {
	
	LoginDetails detail;
  
  @BeforeMethod
  @Parameters("browser")
  public void setUp(String browser) throws Exception {
	  browserLaunch(browser, getValue("url"));
	  
	  
  }

  @Test
  public void loginPage() {
	  detail= new LoginDetails(driver);
	  detail.login();
	  

	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  
  }

}
