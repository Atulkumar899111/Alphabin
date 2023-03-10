package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Frameworkutility {
	 
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	
	public static void chromeSetup(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public static WebElement findElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement findElementBylinkText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}
	public static WebElement findElementByid(String id) {
		return driver.findElement(By.id(id));
	}

}
