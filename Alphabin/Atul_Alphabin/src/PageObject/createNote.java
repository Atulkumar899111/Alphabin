package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;

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


public class createNote extends Frameworkutility {
	@Then("^Create a note$")
	public void create_a_note() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		findElementByid("qa-HOME_NOTE_WIDGET_CREATE_NOTE").click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		findElement("//*[@id=\"en-note\"]/div/br").sendKeys("Fist note ");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		findElementByid("qa-TASK_DUCHY_CREATE_TASK").click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		findElementByid("qa-TASKS_MODAL_TITLE").sendKeys("New task");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		findElementByid("qa-TASKS_MODAL_SUBMIT").click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}