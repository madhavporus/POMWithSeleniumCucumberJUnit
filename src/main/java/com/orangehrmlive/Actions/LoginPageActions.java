package com.orangehrmlive.Actions;

import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.Locators.LoginPageLocators;
import com.orangehrmlive.Utils.HelperClass;

public class LoginPageActions {
	
	LoginPageLocators loginPageLocators = null;
	//HelperClass helperClass = new HelperClass();
	
	
	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
		}
	
	public void enterUserName(String userName) {
		
		loginPageLocators.uName.sendKeys(userName);
		
	}
	
	public void enterPassword(String password) {
		
		loginPageLocators.pWord.sendKeys(password);
		
	}
	
	public void clickOnLogin() {
		
		loginPageLocators.button.click();
		
	}
	
	
	
	public String getErrorMsgForInvalidCreDentials() {
		return loginPageLocators.eRrorMessage.getText();
	}
	
	
	
	
	
	
	
	
	

}
