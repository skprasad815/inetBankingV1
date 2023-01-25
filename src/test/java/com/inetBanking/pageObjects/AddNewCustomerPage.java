package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver ldriver;

	public AddNewCustomerPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement ClickNewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement cName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement cGender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement cDOB;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement cAddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement cCity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement cState;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement cPin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement cPhoneno;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement cEmailId;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement SubmitBtn;


public void ClickNewCustomer() {
	ClickNewCustomer.click();
	}
public void setCustomerName(String cname) {
	cName.sendKeys(cname);
	}
public void setGender(String gender) {
	cGender.sendKeys(gender);
}

public void setDateofBirth(String dd,String mm, String yy) {
	cDOB.sendKeys(dd);
	cDOB.sendKeys(mm);
	cDOB.sendKeys(yy);
}

public void setAddress(String addr) {
	cAddress.sendKeys(addr);
}

public void setCityName(String CityN) {
	cCity.sendKeys(CityN);
}

public void setStateName(String StateN) {
	cState.sendKeys(StateN);
}

public void setPinCode(String PINno) {
	cPin.sendKeys(PINno);
}

public void setPhoneNo(String No) {
cPhoneno.sendKeys(No);	
}

public void setEmailId(String Email) {
	cEmailId.sendKeys(Email);
}

public void ClickSubmitBtn() {
	SubmitBtn.click();
}

}
