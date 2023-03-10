package com.inetBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.inetBanking.testCases.BaseClass;


public class TestUtil extends BaseClass {

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(".\\Screenshots\\" + screenshotName));
		FileUtils.copyFile(scrFile,
				new File(".\\Extent-reports\\" + screenshotName));

	}

	
	}
	
