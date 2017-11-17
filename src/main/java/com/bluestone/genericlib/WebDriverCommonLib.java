package com.bluestone.genericlib;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Snehal
 *
 */

import com.relevantcodes.extentreports.ExtentTest;

public class WebDriverCommonLib 
{
	public static HashMap<String, String> map;
	public ExtentTest logger;
	WebDriver driver;
	
	public void waitForpageLoad(WebDriver driver)
	{
		
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	public void waitForElementPresent(WebElement wb)
	{
	
		
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	public void selectByVisibletext(WebElement wb, String data)
	{
		Select sel = new Select(wb);
		//sel.selectByVisibleText(data);
		sel.selectByValue(data);
	}
	public void selectByIndex(WebElement wb, int index)
	{
		Select sel = new Select(wb);
		sel.selectByIndex(index);
	}
	public HashMap<String, String> getWindowHandle()
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		
		map.put("parentWinId", itr.next());
		map.put("childWinId",itr.next());
		return map;
		
	}
	
		
	
	
	public void action(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
	}
	public void scrollDwn()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	
	
}
