package BDD.firstPackage.TestRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/Login.feature",
        glue = "BDD.firstPackage.StepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ValidLoginTestRun {

}
