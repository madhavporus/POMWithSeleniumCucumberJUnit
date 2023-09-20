package com.orangehrmlive.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath = "//*[@Class=\"oxd-topbar-header-userarea\"]/ul//span/child::p")
	public WebElement userNameOnHomePage;

}
