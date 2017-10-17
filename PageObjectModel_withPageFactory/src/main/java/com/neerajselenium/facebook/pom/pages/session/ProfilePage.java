package com.neerajselenium.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

	WebDriver driver;
	public ProfilePage(WebDriver driver){
		this.driver = driver;
		
	}

	@FindBy(xpath="//*[@id='fb-timeline-cover-name']")
	public WebElement Name;
	
	public String testProfile(){
		String profileName = Name.getText();
		return profileName;
		
		
		
	}
	
}
