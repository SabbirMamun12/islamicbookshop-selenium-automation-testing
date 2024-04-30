package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.OrderBookPage;
import utilities.BaseDriver;

public class OrderBookTest extends BaseDriver{
	OrderBookPage orderBookPage = new OrderBookPage();
	
	@Test(priority = 1)
	@Description("Click Order button for order the book")
	public void ClickOrderbutton() {
		getDriver().get(orderBookPage.orderbookurl);
		orderBookPage.button(orderBookPage.orderbookbuttonpath);
		orderBookPage.takeScreenShot("ClickOrderButton");
		
	}
	@Test(priority = 2)
	public void buttonworkproperly() {
		getDriver().get(orderBookPage.orderbookurl);
		orderBookPage.button(orderBookPage.orderbookbuttonpath);
		Assert.assertEquals(getDriver().getTitle(), "Checkout | Islamic Shop Dhaka | Online book store inBangladesh");
	
	}

}
