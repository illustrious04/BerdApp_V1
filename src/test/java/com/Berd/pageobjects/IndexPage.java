package com.Berd.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	WebDriver driver;                                  //Step 1:- Create Object of WebDriver. 

	public IndexPage(WebDriver rdriver)               // Create a constructor 
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);      // Step 2:- Calling init element method
	}
	
	
}
