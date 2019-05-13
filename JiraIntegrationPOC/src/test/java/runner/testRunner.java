package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/sample.feature"},
        glue = {"stepDef"},
        plugin = {"pretty", "json:target/jsonreport.json"})
public class testRunner extends AbstractTestNGCucumberTests {
}

