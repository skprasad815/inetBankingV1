package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomisedStatementPage {

	WebDriver ldriver;

	public CustomisedStatementPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	@FindBy(linkText="Customised Statement")
	@CacheLookup
	WebElement ClickCustomisedStatement;
	
	@FindBy(name="accountno")
	@CacheLookup
	WebElement cAccountName;
	
	@FindBy(name="fdate")
	@CacheLookup
	WebElement cFromDate;
	
	@FindBy(name="tdate")
	@CacheLookup
	WebElement cToDate;
	
	@FindBy(name="loweramt")
	@CacheLookup
	WebElement cAmtLimit;
	
	@FindBy(name="tranno")
	@CacheLookup
	WebElement cNoTrans;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement cSubmitbtn;
	
	
	public void ClickCustomisedStatements() {
		ClickCustomisedStatement.click();	
	}
	
	public void setAccNo(String no) {
		cAccountName.sendKeys(no);	
	}
	public void setFromDate(String dd,String mm, String yyyy) {
		cFromDate.sendKeys(dd,mm,yyyy);	
	}
	public void setToDate(String dd,String mm, String yyyy) {
		cToDate.sendKeys(dd,mm,yyyy);	
	}
	public void setAmtlimit(String amt) {
		cAmtLimit.sendKeys(amt);	
	}
	public void setNoOfTrans(String trno) {
		cNoTrans.sendKeys(trno);	
	}
	public void ClickSubmitbtn() {
		cSubmitbtn.click();	
	}
}

