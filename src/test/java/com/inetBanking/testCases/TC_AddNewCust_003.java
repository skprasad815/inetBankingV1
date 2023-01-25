package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddNewCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewCust_003 extends BaseClass  {

	
	@Test
public void AddNewCustomer() throws InterruptedException, IOException  {
	
	LoginPage lp=new LoginPage(driver);
	
	lp.setusername(user);
	lp.setpassword(pass);
	lp.clickLoginbtn();
	logger.info("login successful");
	Thread.sleep(3000);
	
	AddNewCustomerPage addCust= new AddNewCustomerPage(driver);
	addCust.ClickNewCustomer();
	logger.info("adding New Customer");
	addCust.setCustomerName("sanjay");
	addCust.setGender("male");
	addCust.setDateofBirth("01","02","1995");
	addCust.setAddress("india");
	addCust.setCityName("hyderabad");
	addCust.setStateName("Telangana");
	addCust.setPinCode("567890");
	addCust.setPhoneNo("4565676789");
String email=RandomString()+"@gmail.com";
	
	
	addCust.setEmailId(email);
	addCust.ClickSubmitBtn();
	logger.info("new customer added");
	Thread.sleep(3000);
	
	
	  boolean res
	  =driver.getPageSource().contains("Customer Registerd Successfully!!!");
	  if(res==true) { Assert.assertTrue(true); System.out.println("test pass"); }
	  else { captureScreenshot(driver,"AddNewCustomer"); Assert.assertTrue(false);
	  System.out.println("test fails"); }
	 
	}	
	}
