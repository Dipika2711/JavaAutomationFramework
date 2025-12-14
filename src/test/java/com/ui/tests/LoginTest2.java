package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
public class LoginTest2 {

	public static void main(String[] args) {

		WebDriver wd= new ChromeDriver();
		HomePage homePage = new HomePage(wd);//passing the driver to launch a new browser window
		LoginPage loginPage = homePage.goToLoginPage();
		loginPage.doLoginWith("yahimi7971@roastic.com", "Password");
		
		
		

}
}

