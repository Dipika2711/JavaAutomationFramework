package com.ui.tests;



import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.constant.Browser.*;
import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;


@Listeners(com.ui.listeners.TestListener.class)
public class LoginTest extends TestBase {


	
	@BeforeMethod(description="Load the homepage of the website")
	public void setup() {
		 homePage = new HomePage(CHROME);//passing the driver to launch a new browser window
		
	}
	
	
	
	@Test(description ="Verifies if the valid user is able to login", groups = {"e2e","sanity"},dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,dataProvider="LoginTestDataProvider",
			retryAnalyzer=com.ui.listeners.MyRetryAnalyzer.class)
public void loginTest(User user){
	
	assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Dipika Zope");

		
		

}
	
	@Test(description ="Verifies if the valid user is able to login", groups = {"e2e","sanity"},dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,
			dataProvider="LoginTestCSVDataProvider")
	public void loginCSVTest(User user){
		
		
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Dipika Zope");

			
			

	}
	
	

	@Test(description ="Verifies if the valid user is able to login", groups = {"e2e","sanity"},dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,
			dataProvider="LoginTestExcelDataProvider")
	public void loginExcelTest(User user){
		
		
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Dipika Zope");

			
			

	}
	
	
	
	
}

