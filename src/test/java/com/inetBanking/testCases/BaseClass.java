package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ExcelReader;
import com.inetBanking.utilities.ReadConfig;



public class BaseClass {
ReadConfig readconfig=new ReadConfig();
	
	
	public String url = readconfig.getApplicationurl();
	public String user = readconfig.getusername();
	public String pass = readconfig.getpasswordL();
	public static WebDriver driver;
	public static 	Logger logger;
	public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\java\\com\\inetBanking\\testData\\LoginData.xlsx");
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger=	Logger.getLogger("devpinoyLogger");
PropertyConfigurator.configure("log4j.properties");

if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getchromePath());
		driver = new ChromeDriver();
	}
else if (br.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxPath());
	driver = new FirefoxDriver();
}
else if (br.equals("ie")) {
	System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
	driver = new InternetExplorerDriver();
	}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get(url);
logger.info("URL is opened");

}
	
	@AfterClass
	public void teardown() {
driver.quit();
	}

	public static void captureScreenshot(WebDriver drover, String name) throws IOException  {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File target=new File(System.getProperty("user.dir")+"/Screenshots/"+ name + ".png");
		FileUtils.copyFile(scrFile,target);
		System.out.println("Screenshot taken");
	}
	public String RandomString() { // used for generating random email in add customer test
		
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
		}
		public String RandomNum() {
			
			String generatedstring2=RandomStringUtils.randomNumeric(5);
			return generatedstring2;
			}
	
	}

