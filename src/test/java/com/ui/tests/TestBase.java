package com.ui.tests;

import static com.constant.Browser.CHROME;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.constant.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTestUtility;
import com.utility.LoggerUtility;

public class TestBase {
	
	protected HomePage homePage;
	Logger logger=LoggerUtility.getLogger(this.getClass());
	
	private boolean  isLambdaTest;
	
	@Parameters({"browser","isLambdaTest","isHeadless"})
	
	
	
	
	
	@BeforeMethod(description="Load the homepage of the website")
	public void setup(
			@Optional ("chrome")String browser, 
			@Optional("false")boolean isLambdaTest,
			@Optional ("true") boolean isHeadless, ITestResult result) {
		
		
		this.isLambdaTest=isLambdaTest;
		
		WebDriver lamdaDriver;
		if(isLambdaTest) {
			lamdaDriver= LambdaTestUtility.intializeLambdaTestSession(browser, result.getMethod().getMethodName());
			homePage= new HomePage(lamdaDriver);
			
		}else {
		logger.info("Load the HomePage of the website");
		 homePage = new HomePage(Browser.valueOf(browser.toUpperCase()),isHeadless);//passing the driver to launch a new browser window//true indicates run in headless parameter
		
	}
	}
	
	
	public BrowserUtility getInstance() {
		
		return homePage;
		
	}
	
	@AfterMethod(description="Tear Down the browser")
	public void tearDown() {
		if(isLambdaTest) {
			
			LambdaTestUtility.quitSession();//quit or close all lamda test session
			
		}
		
		else {
			homePage.quitSession();//quit the browser session on local
		}
	}

}
