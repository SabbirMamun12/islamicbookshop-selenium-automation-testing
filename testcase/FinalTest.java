package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.BasePage;
import pages.FinalPage;
import pages.HomePage;
import pages.OrderBookPage;
import pages.SelectBookPage;
import pages.ShipingInfoPages;
import utilities.BaseDriver;

public class FinalTest extends BaseDriver{
	BasePage basePage =new BasePage();
	HomePage homePage = new HomePage();
	SelectBookPage selectBookPage = new SelectBookPage();
	OrderBookPage orderBookPage = new OrderBookPage();
	ShipingInfoPages shipingInfoPages = new ShipingInfoPages();
	FinalPage finalPage = new FinalPage();
	HomePageTest homePageTest = new HomePageTest();
	SelectBookTest selectBookTest = new SelectBookTest();
	OrderBookTest orderBookTest = new OrderBookTest();
	ShipingInfoTest shipingInfoTest = new ShipingInfoTest();
	
	@Test
	@Description("Get the url then click the genaral catagories then choose the book then order the book then giving the shiping information for finished the order")
	public void IntegrationTest() throws InterruptedException {
		homePageTest.clickgenarel();
		Thread.sleep(3000);
		
		basePage.button(selectBookPage.selectbookpath);
		selectBookPage.takeScreenShot("ClickBook");
		Thread.sleep(3000);
		
		orderBookPage.button(orderBookPage.orderbookbuttonpath);
		orderBookPage.takeScreenShot("ClickOrderButton");
		Thread.sleep(3000);
		
		shipingInfoPages.inputtext(shipingInfoPages.namepath, "SabbirMamun");
		Thread.sleep(2000);
		shipingInfoPages.inputtext(shipingInfoPages.numberpath, "1771887647");
		Thread.sleep(2000);
		shipingInfoPages.inputtext(shipingInfoPages.altnumberpath, "0172885682");
		Thread.sleep(2000);
		shipingInfoPages.inputtext(shipingInfoPages.addresspath, "Bhangura,pabna,Rajshahi");
		Thread.sleep(2000);
		shipingInfoPages.button(shipingInfoPages.Nextbuttonpath);
		Thread.sleep(2000);
		shipingInfoPages.button(shipingInfoPages.cashonhomenextbuttonpath);
		Thread.sleep(5000);
		shipingInfoPages.takeScreenShot("OrderConfirm");
		
		
	}

}
