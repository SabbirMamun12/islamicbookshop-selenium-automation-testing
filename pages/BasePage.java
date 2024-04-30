package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Allure;

import static utilities.BaseDriver.getDriver;

import java.io.ByteArrayInputStream;;;

public class BasePage {
	
	public WebElement getpath(By locator) {
		return getDriver().findElement(locator);
		
	}
	
	public void inputtext(By locator, String text) {
		getpath(locator).sendKeys(text);
	}
	
	public void button(By locator) {
		getpath(locator).click();
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	

	

}
