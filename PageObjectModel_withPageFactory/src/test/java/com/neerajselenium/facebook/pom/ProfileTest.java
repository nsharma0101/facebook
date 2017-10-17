package com.neerajselenium.facebook.pom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.neerajselenium.facebook.pom.pages.LaunchPage;
import com.neerajselenium.facebook.pom.pages.LoginPage;
import com.neerajselenium.facebook.pom.pages.session.LandingPage;
import com.neerajselenium.facebook.pom.pages.session.ProfilePage;

public class ProfileTest {
	
	@Test
	public void doProfileTest(){
		
		String exptectedProfileName = "Nilesh sharma";	
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LaunchPage lp = PageFactory.initElements(driver,LaunchPage.class);		
		LoginPage loginPage = lp.gotoLoginPage();
		LandingPage landingPage = loginPage.gotoLandingPage("neerajvsharma@gmail.com", "vinnpv1980");
		ProfilePage profilePage = landingPage.gotoProfilePage();
		String actualProfileName = profilePage.testProfile();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualProfileName, exptectedProfileName);
		softAssert.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
