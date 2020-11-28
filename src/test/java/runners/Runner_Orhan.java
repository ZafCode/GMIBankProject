package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features ="src\\test\\resources\\UiFeatures\\TC_001.feature",
        glue = "stepdefinitions",
        tags = "@US_001",
        dryRun = false

)
public class Runner_Orhan {
}
