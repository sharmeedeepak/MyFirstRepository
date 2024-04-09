package org.ada;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
				 glue="com.ada",
//				 dryRun = true, 
				 plugin = "junit",
				 publish = true)

public class TestRunner {
	
}
