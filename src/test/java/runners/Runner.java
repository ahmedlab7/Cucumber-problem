package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\TESTING\\cucumber\\Cucumber-master\\src\\test\\java\\features\\something.feature", 
glue = { "stepDefinition" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )
public class Runner {
	
	

}

