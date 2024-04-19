package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\Features\\LoginDemo.feature",glue= {"StepDefinitions"},
monochrome = true,
tags = "@important",
plugin = {"pretty","junit:target/JunitReports/Report.xml"})

public class TetsRunner {
	
}
