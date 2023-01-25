package PageObject;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/PageObject/registerFeature/createNote/Register"
		,glue={"PageObject"}
		)

public class RunnerRegister extends AbstractTestNGCucumberTests{
	
}