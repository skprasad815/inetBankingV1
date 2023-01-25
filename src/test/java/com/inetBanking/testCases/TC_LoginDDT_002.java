package com.inetBanking.testCases;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginDDT_002 extends BaseClass{

	@Test(dataProvider="getdata")
	public void LoginDDT(String user, String pass) throws Exception {
		LoginPage lp= new LoginPage(driver);	
		lp.setusername(user);
		logger.info("username is provided");
		lp.setpassword(pass);
		logger.info("password is provided");
		lp.clickLoginbtn();
		logger.info("login button clicked");
		Thread.sleep(3000);
		if(isAlertPresent()==true) {
		
			driver.switchTo().alert().accept(); //close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed" );
		}
		else {
			Assert.assertTrue(true);
			logger.info("test is passed");
		lp.clickLogout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); //close logout alert
		driver.switchTo().defaultContent();
		
		}
		
	}
		
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider
	public Object[][] getdata() {
	
String sheetName="logindata";
		
int rows =excel.getRowCount(sheetName);
System.out.print("Row : "+rows);
int cols =excel.getColumnCount(sheetName);
Object[][] data =new Object[rows-1][cols];


for(int rowNum=2;rowNum<=rows;rowNum++) {   //2
	for(int colNum=0;colNum<cols;colNum++)	{
		
	//data[0][0]	
	data[rowNum-2][colNum]=excel.getCellData(sheetName,colNum, rowNum);
}


}
return data;

}
}
