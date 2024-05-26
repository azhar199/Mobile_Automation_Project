package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Appium/src/test/java/Features", glue = {
		"StepDefinition" }, dryRun = true, monochrome = true)

public class Runner_File {

}
