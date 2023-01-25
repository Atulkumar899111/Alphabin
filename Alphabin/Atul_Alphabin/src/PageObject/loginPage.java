package PageObject;

import java.time.Duration;

import Configfile.path;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.Frameworkutility;

public class loginPage extends Frameworkutility {
	@Given("^Open login page$")
	public void open_login_page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElement(path.login).click();
	}
	@Then("^Enter login fields userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_login_fields_userid_something_and_password_something(String userid, String pass) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElementByid("username").sendKeys(userid);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElementByid("loginButton").click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElementByid("password").sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElementByid("loginButton").click();
		Thread.sleep(20);
        driver.quit();
	}
}
