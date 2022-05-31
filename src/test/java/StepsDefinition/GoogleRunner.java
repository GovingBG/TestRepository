package StepsDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue= {"StepsDefinition"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/report2.xml",
		"json:target/JSONReports/report2.json",
		"html:target/HTMLreports2"},
tags="@smoketest"
)
public class GoogleRunner {

}
