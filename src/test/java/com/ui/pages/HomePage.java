package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constant.Browser;
import static com.constant.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

import static  com.utility.PropertiesUtil.*;


public final  class HomePage extends BrowserUtility  {
	
    static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");

    // ✅ Required because parent has a parameterized constructor
    public HomePage(Browser chrome, boolean b) {
        super(chrome);
		//goToWebsite(readProperty(QA, "URL"));
        goToWebsite(JSONUtility.readJson(QA).getUrl());


        
        
    }  
    
    
    
  		public HomePage(WebDriver lamdaDriver) {
  		// TODO Auto-generated constructor stub
  	}

     
		public LoginPage goToLoginPage() {// page functions // cannot use void returm type
        	clickOn(SIGN_IN_LINK_LOCATOR);
        	LoginPage loginPage = new LoginPage(getDriver());/// we are passing the driver to login page by creating getters in browser utility
        	return loginPage;
        	
        
    }






		public void quitSession() {
			// TODO Auto-generated method stub
			
		}
}