package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.CustomisedStatementPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_CustomisedStatement_004 extends BaseClass {
	@Test
	public void CustomisedStatement() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(user);
		lp.setpassword(pass);
		lp.clickLoginbtn();
		logger.info("login successful");
		Thread.sleep(3000);
		logger.info("successfully login");
		
		CustomisedStatementPage CstStmt=new CustomisedStatementPage(driver);
		CstStmt.ClickCustomisedStatements();
		logger.info("clicked on customised statements");
		CstStmt.setAccNo("235684656");
		CstStmt.setFromDate("12","10","2022");
		CstStmt.setToDate("29","10","2022");
		CstStmt.setAmtlimit("5000");
		CstStmt.setNoOfTrans("10");
//CstStmt.ClickSubmitbtn();
		logger.info("test complete");
	}
}