package com.berd.BaseClass;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import appUtility.Utility;



public class BaseTest_OpenBrowser {
	
	
	//public static WebDriver driver = new ChromeDriver();
		
//-----------------SetUp Browser-------------------------
	@BeforeClass
	public void setupBrowser() throws InterruptedException, IOException 
	{
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("120");
		WebDriver driver = new ChromeDriver(co);
		
		//---------------------------Open URL and initate the logger------------------------------------------------------
		driver.get(Utility.fetchPropertyValue("url").toString());

		//---------------------Setup implicit Waits for all the test cases.-----------------------------
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//----Maximize the browser------------
		driver.manage().window().maximize();
	}
}
