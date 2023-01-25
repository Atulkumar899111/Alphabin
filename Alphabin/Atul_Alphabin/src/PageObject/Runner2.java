package PageObject;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/PageObject/createnoteFeature/createNote"
		,glue={"PageObject"}
		)

public class Runner2 extends AbstractTestNGCucumberTests{
	
}