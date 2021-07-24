package testRunner;

import org.junit.runner.
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"stepDefinition"}
 )
 


public class Runner {
	
	

}
