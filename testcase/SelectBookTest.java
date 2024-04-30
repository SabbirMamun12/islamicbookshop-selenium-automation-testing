package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.BasePage;
import pages.SelectBookPage;
import utilities.BaseDriver;

public class SelectBookTest extends BaseDriver {
	
	BasePage basePage = new BasePage();
	
	SelectBookPage selectBookPage = new SelectBookPage();
	
	@Test(priority = 1)
	public void scrolselectbook() throws InterruptedException {
		
		getDriver().get(selectBookPage.selectbookurl);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebElement Element = getDriver().findElement(By.xpath("//div[@id='page']/div[@id='content']/div[1]/div[1]/main/div/ul/li[15]/div[1]/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	@Test(priority = 2)
	@Description("Choose The book for select the book")
	public void clickbook() throws InterruptedException {
		getDriver().get(selectBookPage.selectbookurl);
		basePage.button(selectBookPage.selectbookpath);
		selectBookPage.takeScreenShot("ClickBook");
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 3)
	public void clickgenareltitle() {
		getDriver().get(selectBookPage.selectbookurl);
		basePage.button(selectBookPage.selectbookpath);
		Assert.assertEquals(getDriver().getTitle(), "বিজনেস ব্লুপ্রিন্ট | ইসলামিক শপ ঢাকা");
	}
}
