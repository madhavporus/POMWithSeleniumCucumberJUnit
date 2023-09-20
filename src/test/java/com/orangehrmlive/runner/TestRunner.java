package com.orangehrmlive.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/LoginPageR.feature",
		glue = "com.orangehrmlive.stepdefinitions",
		dryRun = false,
		plugin= {"pretty",
				"html:target/CucumberReports/CucumberReport.html"
		
		}
		)

public class TestRunner {
		
}


