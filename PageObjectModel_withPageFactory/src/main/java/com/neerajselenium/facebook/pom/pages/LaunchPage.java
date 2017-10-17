package com.neerajselenium.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class LaunchPage {
	WebDriver driver; 
	
	public LaunchPage(WebDriver driver){
		this.driver = driver;
		
	}
	

	
	
	public LoginPage gotoLoginPage(){

		driver.get("http://facebook.com");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		return login;
	
		
	}

}
