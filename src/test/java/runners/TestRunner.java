package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/apiTest.feature",
        glue = {"com.coindesk.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags="@coin"
)
public class TestRunner {
}
