package StepsDefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"StepsDefinition"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HTMLreports"},
tags="@smokeTest"
)
public class TestRunner {

}

