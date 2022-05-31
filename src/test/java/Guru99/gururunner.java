package Guru99;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/guru99/guru.feature",glue= {"Guru99"},
monochrome = true,
/*plugin={"pretty","junit:target/JunitReports/report2.xml",
		"json:target/JSONReports/report2.json",
		"html:target/HTMLreports2"},*/

tags = "@SmokeTest") 
/*@CucumberOptions(feature = { "pretty","html:reports/test-report" },
         tags = "@SmokeTest", 
		dryRun = true, 
		monochrome = true, 
		features = "Guru99Bank", 
		glue = "Guru99Bank")*/

public class gururunner {


}
