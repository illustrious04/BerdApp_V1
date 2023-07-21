package com.berd.BaseClass;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import appUtility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest_OpenBrowser {
	
	public static WebDriver driver;
		
//-----------------SetUp Browser-------------------------
	@BeforeClass
	public void setupBrowser() throws InterruptedException, IOException 
	{
		if (Utility.fetchPropertyValue("browser").toString().equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (Utility.fetchPropertyValue("browser").toString().equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		//---------------------------Open URL and initate the logger------------------------------------------------------
		driver.get(Utility.fetchPropertyValue("url").toString());

		//---------------------Setup implicit Waits for all the test cases.-----------------------------
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//----Maximize the browser------------
		driver.manage().window().maximize();
	}
}
