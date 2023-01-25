package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		
	
	
	File src = new File("./Configuration/config.properties");
	
	try {
		FileInputStream fis= new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	} catch (Exception e) {
		System.out.println("Exception is "+e.getMessage());
	}
	}
	public String getApplicationurl() {
		String URL=pro.getProperty("url");
		return URL;
	}
		
	public String getusername() {
		String username=pro.getProperty("user");
		return username;
	}
		
	public String getpasswordL() {
		String password=pro.getProperty("pass");
		return password;
	}
	
	public String getchromePath() {
		String Chrome=pro.getProperty("chrome");
		return Chrome;
	}
	public String getfirefoxPath() {
		String Firefox=pro.getProperty("firefox");
		return Firefox;
	}
	public String getIEPath() {
		String IE=pro.getProperty("ie");
		return IE;
	}
}
