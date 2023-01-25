package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Configfile.path;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Frameworkutility;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstpage extends Frameworkutility {

	public static String url = "https://evernote.com/";

	@Given("^Open evernote$")
	public void open_evernote() throws Exception {
		chromeSetup(url);
	}

	@Then("^Close the banner$")
	public void close_the_banner() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement newPopup = findElement(path.closeBanner);
		try {
			if(newPopup.isDisplayed()) {
				newPopup.click();
			}
		} catch (Exception e) {
			System.out.println("No such elemrnt found");
		}
//		
//		
//		
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		findElement(path.signUp).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement secondPopup = findElement(path.closeBanner);
//		try {
//			if(secondPopup.isDisplayed()) {
//				secondPopup.click();
//			}
//		} catch (Exception e) {
//			System.out.println("No such elemrnt found");
//		}
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("path.televisions")));
//		findElement(path.televisions).click();
	}
}