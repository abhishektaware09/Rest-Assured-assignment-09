package RestAssured9;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Features", 
		glue = { "stepDefinitions" },
		plugin= {"pretty","testNg:target/testNg-reports"},
		monochrome = true
		)

public class runner extends testdefination{

}