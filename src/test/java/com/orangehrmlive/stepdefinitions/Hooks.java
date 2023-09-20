package com.orangehrmlive.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrmlive.Utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	@Before
	public static void setDriver() {
		HelperClass.setDriver();
		
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(screenshot,"image/png", scenario.getName());
		}
		HelperClass.tearDown();
		
	}
	
	
	

}
