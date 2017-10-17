package com.neerajselenium.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver; 
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id='navItem_100002584393461']")
	public WebElement profile;
			
	
	public ProfilePage gotoProfilePage(){
		profile.click();
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		return profilePage;
		
	}

}
