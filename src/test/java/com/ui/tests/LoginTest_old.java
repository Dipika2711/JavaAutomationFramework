package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest_old {

	public static void main(String[] args) {

		WebDriver wd= new ChromeDriver();
		
		// chrome driver is child class and object is created of child class and reference variable is always of parent class
		//whenever you are creatinng object of chrome driver chrom brorwser is created
		
	BrowserUtility browserUtility= new BrowserUtility(wd);
	browserUtility.goToWebsite("http://www.automationpractice.pl");
		// browser is getting launch and selenium webdriver is opening the website
		
		//in order to mximize the browser window
		
		browserUtility.maximizeWindow();
		
		
		By signInLinkLocator=By.xpath("//a[contains(text(),\"Sign in\")]");
		
		browserUtility.clickOn(signInLinkLocator);
	
	
	
	By emailTextBoxLocator= By.id("email");
	browserUtility.enterText(emailTextBoxLocator, "yahimi7971@roastic.com");
	
	
	
	By passwordTextBoxLocator= By.id("passwd");
	browserUtility.enterText(passwordTextBoxLocator, "password");

	
	By submitLoginButtonLocator= By.id("SubmitLogin");
	browserUtility.clickOn(submitLoginButtonLocator);
	

	}

}
