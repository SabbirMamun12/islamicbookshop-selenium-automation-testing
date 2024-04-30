package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.BasePage;
import pages.HomePage;
import utilities.BaseDriver;

public class HomePageTest extends BaseDriver{
	
	HomePage homePage = new HomePage();
	
	@Test(priority = 1)
	public void homepagetitle() {
		getDriver().get(homePage.url);
		Assert.assertEquals(getDriver().getTitle(), "স্পেশাল ডিসকাউন্ট পেজ । ইসলামিক বই কিনুন সবচেয়ে কমদামে | Islamic Shop Dhaka | Online book store inBangladesh");
	}
	
	@Test(priority = 2)
	public void enablebutton() {
		getDriver().get(homePage.url);
		boolean checkbox = getDriver().findElement(By.xpath("//a[@href='https://islamicshopdk.com/general-books']")).isEnabled();
		Assert.assertEquals(checkbox, true);
	}
	
	@Test(priority = 3)
	@Description("Click Genarelcatgories From Homepage")
	public void clickgenarel() {
		getDriver().get(homePage.url);
		homePage.button(homePage.genarelbookpath);
		homePage.takeScreenShot("ClickGenarelCatagories");
	}
	
	@Test(priority = 4)
	public void genarelbuttnwork() {
		getDriver().get(homePage.url);
		homePage.button(homePage.genarelbookpath);
		Assert.assertEquals(getDriver().getTitle(), "জেনারেল বুকস | Islamic Shop Dhaka | Online book store inBangladesh");
	}

}
