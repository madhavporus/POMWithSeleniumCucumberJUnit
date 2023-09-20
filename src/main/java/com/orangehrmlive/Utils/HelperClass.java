package com.orangehrmlive.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	
private static HelperClass helperclass = null;
private static WebDriver driver =  null;

public final int TIMESOUT = 20;

private HelperClass() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESOUT));
	driver.manage().window().maximize();
}

public static void setDriver() {
	
	if(helperclass == null) {
		helperclass = new HelperClass();	
		
	}
}
	
public static WebDriver getDriver() {
	return driver;
	}



public static void navigateToURL(String url) {
	driver.get(url);
}

public static void tearDown() {
	
	if (driver != null) {
		driver.quit();
	}
	helperclass = null;
}




} ///Class Ends
