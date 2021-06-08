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
        //plugin ={"pretty", "html: target/cucumber-html-reports"}--for normal report
)
public class ValidLoginTestRun {

}
//https://www.toolsqa.com/extent-report/extent-report-for-cucumber-junit-project/ for reports and screenshot