package com.orangehrmlive.Actions;

import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.Locators.HomePageLocators;
import com.orangehrmlive.Utils.HelperClass;

public class HomePageActions {
	
	HomePageLocators homePageLocators = null;
	
	
	public HomePageActions() {
		
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(), homePageLocators);

	}
	
	public String homePageUserName() {
		return homePageLocators.userNameOnHomePage.getText();
		
	}
	
	

}
