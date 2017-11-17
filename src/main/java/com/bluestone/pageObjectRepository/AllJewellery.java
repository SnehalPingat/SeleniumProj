package com.bluestone.pageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.bluestone.genericlib.WebDriverCommonLib;

public class AllJewellery

{
	WebDriverCommonLib w = new WebDriverCommonLib();

	@FindBy(xpath = "//span[contains(text(), 'All Jewellery ')]")
	private WebElement allJewellDropDwnLnk;

	public WebElement getallJewellDropDwnLnk() {
		return allJewellDropDwnLnk;
	}

	@FindBy(xpath = "//div[@class='wh-submenu']/ul/li[4]/div[1]/div/a/span[contains(text(),'Mangalsutras')]")
	private WebElement mangalsutraBtn;

	public WebElement getMangalsutraBtn() {
		return mangalsutraBtn;
	}

	@FindBy(xpath = "//section[@id='Price-form']/span[@class='title style-fill i-right']")
	private WebElement priceDropDwnLnk;

	public WebElement getPriceDropDwnLnk() {
		return priceDropDwnLnk;
	}

	@FindBy(xpath = "//form[@id='price']/div/div[1]/a[@data-displayname='below rs 10000']")
	private WebElement below10ThouRs;

	public WebElement getBelow10ThouRs() {
		return below10ThouRs;
	}

	@FindBy(xpath = "//div[@class='pr-i lazy-bg']/div/a[@id='pid_26359']")
	private WebElement img;

	public WebElement getImg() {
		return img;
	}

	@FindBy(xpath = "//div[@id='grid-view-result']/ul[1]/li[1]/div[1]/div[1]/span[1]/div/div/div[2]/a[contains(text(),'View Details')]")
	private WebElement viewDetailBtn;

	public WebElement getViewDetailBtn() {
		return viewDetailBtn;
	}

	public void navigateToMangalsutraPage() {
		w.action(allJewellDropDwnLnk);
		mangalsutraBtn.click();

	}

}
