package testcase;

import org.checkerframework.checker.units.qual.degrees;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.ShipingInfoPages;
import utilities.BaseDriver;

public class ShipingInfoTest extends BaseDriver{

	ShipingInfoPages shipingInfoPages = new ShipingInfoPages();
	OrderBookTest orderBookTest = new OrderBookTest();
	
	@Test
	@Description("Enter all shiping information")
	public void givingaddres() throws InterruptedException {
		orderBookTest.ClickOrderbutton();
		Thread.sleep(2000);
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
