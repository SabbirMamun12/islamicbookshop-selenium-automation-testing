package pages;

import org.openqa.selenium.By;

public class ShipingInfoPages extends BasePage{
	
	public By namepath = By.xpath("//input[@name='billing_first_name']");
	public By numberpath = By.xpath("//input[@id='billing_phone']");
	public By altnumberpath = By.xpath("//input[@id='billing_altphone']");
	public By addresspath = By.xpath("//input[@id='billing_address_1']");
	public By Nextbuttonpath = By.xpath("//button[@id='wpmc-next']");
	public By cashonhomenextbuttonpath = By.xpath("//button[@class='button alt button-active wpmc-nav-button current']");
	public By cashoncheckboxpath = By.xpath("//label[@for='payment_method_cod']");

}
