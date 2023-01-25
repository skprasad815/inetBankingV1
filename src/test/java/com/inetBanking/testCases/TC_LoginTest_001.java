package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test 
	public void LoginTest() throws IOException {
	
	
	
	LoginPage lp= new LoginPage(driver);	
		lp.setusername(user);
		logger.info("enter username");
		lp.setpassword(pass);
		logger.info("enter password");
		lp.clickLoginbtn();
		logger.info("login button clicked");
		if(	driver.getTitle().equals("GTPL Bank Manager HomePage")){
			Assert.assertTrue(true);
			logger.info("login test passed");
		}else 
		{
			captureScreenshot(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
		
		}
		
	}
	
		

