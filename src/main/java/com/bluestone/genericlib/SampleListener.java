package com.bluestone.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}
	public void onTestFailure(ITestResult result)
	{
		EventFiringWebDriver edriver = new EventFiringWebDriver(Browser.driver);
		File srcImg = edriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShot/" + result.getMethod().getMethodName() + ".png");
		try 
		{
			FileUtils.copyFile(srcImg, dst);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		/**EventFiringWebDriver edriver = new EventFiringWebDriver(Browser.driver);
		File srcImg = edriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShot" + result.getMethod().getMethodName() + ".png");
		try {
			FileUtils.copyFile(srcImg, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}
