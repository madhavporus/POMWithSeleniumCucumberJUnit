package com.orangehrmlive.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(name = "username")
	public WebElement uName;
	
	@FindBy(name="password")
	public WebElement pWord;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement button;
	
	@FindBy(xpath = "//div[@class = \"oxd-alert-content oxd-alert-content--error\"]/i/following-sibling::p")
	public WebElement eRrorMessage;

}


/*
 * 
 
//div[@class = "oxd-alert-content oxd-alert-content--error"]
//div[@class = "oxd-alert-content oxd-alert-content--error"]/i[@class="oxd-icon bi-exclamation-circle oxd-alert-content-icon"]

//*[@class = "oxd-alert-content oxd-alert-content--error"]/child::i[1]

//*[@class = "oxd-alert-content oxd-alert-content--error"]/following-sibling:p

*/