package com.bluestone.pageObjectRepository;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bluestone.genericlib.Browser;
import com.bluestone.genericlib.WebDriverCommonLib;

public class Login
{
	WebDriverCommonLib com = new WebDriverCommonLib();
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	private WebElement loginPage;
	
	
	@FindBy(xpath="//input[@id='email-id']")
	private WebElement emailEditBox;
	
	
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordEditBox;
	
	@FindBy(xpath="//input[@id='edit-login-account']")
	private WebElement loginBtn;
	
	public void login(String userName, String passWord, WebDriver driver)
	{
		
		loginPage.click();
		 /*Set set =driver.getWindowHandles();
		 Iterator<String> itr = set.iterator();
		 String parentWinId = itr.next();
		 String childWinId = itr.next();
		driver.switchTo().window(childWinId);*/
		emailEditBox.sendKeys(userName);
		passwordEditBox.sendKeys(passWord);
		loginBtn.click();
	}
	
	
}
