package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	private static String browserName = System.getProperty("browser", "chrome");
	private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();

	public static void setDriver(WebDriver driver) {
		BaseDriver.LOCAL_DRIVER.set(driver);
	}

	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();
	}

	public static WebDriver getBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();

		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();

		default:
			throw new RuntimeException("Browser not Found! using given name: " + browserName);
		}
	}

	@BeforeTest
	public static synchronized void setBrowser() {
		WebDriver webDriver = getBrowser(browserName);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}

	@AfterTest
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}

}
