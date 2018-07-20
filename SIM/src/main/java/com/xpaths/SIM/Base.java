package com.xpaths.SIM;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
     
	public static WebDriver driver;
	public static final String Path="./config.properties";
	
	
	public static String getValue(String key) throws Exception
	{
		File file = new File(Path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop= new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	
	public  static void browserLaunch(String browser, String url)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driversall\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driversall\\latestgecko.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driversall\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	
}
