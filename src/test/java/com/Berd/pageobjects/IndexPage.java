package com.Berd.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	WebDriver driver;                                  //Step 1:- Create Object of WebDriver. 

	public IndexPage(WebDriver rdriver)               // Create a constructor 
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);      // Step 2:- Calling init element method
	}
	
	@FindBy(xpath = "//span[normalize-space()='Fast Form']") WebElement FastFormTab;
	
	public void Click_FastForm_Button() {
		FastFormTab.click();	
		}
	
}
