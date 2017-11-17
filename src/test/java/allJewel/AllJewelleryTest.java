package allJewel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bluestone.genericlib.BaseClass;
import com.bluestone.genericlib.Browser;
import com.bluestone.genericlib.Constants;
import com.bluestone.genericlib.SampleListener;
import com.bluestone.genericlib.WebDriverCommonLib;
import com.bluestone.pageObjectRepository.AllJewellery;
import com.bluestone.pageObjectRepository.Login;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author Snehal
 *
 */

@Listeners(SampleListener.class)
public class AllJewelleryTest extends BaseClass {
	// Object Declaration
	Constants constant;
	WebDriver driver;
	Browser browser;
	SampleListener sample;
	WebDriverCommonLib comLib;
	AllJewellery allJewel;
	Login login;

	@BeforeClass
	public void configBeforeClass() {
		// Object Initialization

		browser = new Browser();
		driver = browser.getBrowser();
		comLib = new WebDriverCommonLib();
		allJewel = PageFactory.initElements(driver, AllJewellery.class);
		login = PageFactory.initElements(driver, Login.class);

	}

	@BeforeMethod
	public void configBeforeMethod() {
		// login
		comLib.waitForpageLoad(driver);
		driver.get(Constants.url);

		driver.manage().window().maximize();

		login.login(Constants.email, Constants.password, driver);
	}

	@Test
	public void watchAProduct() {
		logger = extent.startTest("watchAProduct");
		

		logger.log(LogStatus.INFO, "  mangalsutra page ");
		
		allJewel.navigateToMangalsutraPage();
		WebElement priceDropDwnLnk = allJewel.getPriceDropDwnLnk();
		priceDropDwnLnk.click();
		allJewel.getBelow10ThouRs().click();
		comLib.scrollDwn();
		WebElement im = allJewel.getImg();
		comLib.action(im);
		allJewel.getViewDetailBtn().click();
		driver.navigate().back();
		

		/*
		 * Assert.assertTrue(true); logger.log(LogStatus.PASS,
		 * "Assert Pass as the condition is true");
		 */

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		/*
		 * if(result.getStatus()==ITestResult.FAILURE) {
		 * logger.log(LogStatus.FAIL, result.getThrowable()); }
		 */
		extent.endTest(logger);
	}

}
