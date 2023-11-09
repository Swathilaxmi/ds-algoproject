package myRunner;

//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith (Cucumber.class)
    
@CucumberOptions(tags = "", features = {"C:\\\\Users\\\\16692\\\\eclipse-workspace\\\\ds-algoproject\\\\Features\\\\Signin.feature"}, glue = {"StepDefinations"},
                 plugin = {})
    
public class Runner extends AbstractTestNGCucumberTests {
    
}


	
	



	