//package runner;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/features/",
//				 glue={"stepdefinitions","hooks"},
//				 publish=true,
//				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
//public class TestRunner {
//	
//	
//
//}


package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefinitions", "hooks"},
    plugin = {"pretty", "html:target/CucumberReports/CucumberReport.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    
    
}
