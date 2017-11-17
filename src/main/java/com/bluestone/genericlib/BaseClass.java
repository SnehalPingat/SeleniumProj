package com.bluestone.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass
{
	public ExtentReports extent;
	public ExtentTest logger;
	@BeforeSuite
	public void configBeforeSuite()
	{
		extent = new ExtentReports("./test-output/myOwnReport.html",true);
		extent.loadConfig(new File("./extent-config.xml"));
		
	
	}
	@AfterSuite
	public void configAfterSuite()
	{
		extent.flush();
		extent.close();
	}
}




