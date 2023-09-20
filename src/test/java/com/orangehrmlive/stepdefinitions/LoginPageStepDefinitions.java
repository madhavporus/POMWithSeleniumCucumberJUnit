package com.orangehrmlive.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.orangehrmlive.Actions.HomePageActions;
import com.orangehrmlive.Actions.LoginPageActions;
import com.orangehrmlive.Utils.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageStepDefinitions {
	
	LoginPageActions loginPageActions = new LoginPageActions();
	HomePageActions homePageActions = new HomePageActions();
	
	@Given("user is navigated to {string}")
	public void user_is_navigated_to(String string) {
		
		HelperClass.navigateToURL(string);
			    
	}

	@When("user enters the user name as {string}")
	public void user_enters_the_user_name_as(String string) {
		loginPageActions.enterUserName(string);
	    
	}

	@And("enters password as {string}")
	public void enters_password_as(String string) {
		loginPageActions.enterPassword(string);
	    
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		loginPageActions.clickOnLogin();
		
	    
	}

	
	@Then("user must be able to land on home page")
	public void user_must_be_able_to_land_on_home_page() {
		
		assertEquals("Alex Popoescu", homePageActions.homePageUserName());
		
	
	    	}

	@When("user enters credentials as {string} and {string}")
	public void user_enters_credentials_as_and(String string, String string2) {
		loginPageActions.enterUserName(string);
		loginPageActions.enterPassword(string2);
	    
	}

	@And("clicks on signin button")
	public void clicks_on_signin_button() {
		loginPageActions.clickOnLogin();
	    
	}

	@Then("user must be presented with an error message as {string}")
	public void user_must_be_presented_with_an_error_message_as(String string) {
		
		assertEquals(string, loginPageActions.getErrorMsgForInvalidCreDentials());
	    
		
		System.out.println("Test Data-Expected:"+string);
		System.out.println("Actual data from application:"+ loginPageActions.getErrorMsgForInvalidCreDentials());
	}
	
		
	

}
