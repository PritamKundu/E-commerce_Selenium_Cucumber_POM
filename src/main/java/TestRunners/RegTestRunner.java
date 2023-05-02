package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features ="src/test/resources/Features/F1_Register.feature",
            glue ={"StepDefinitions"},
            monochrome = false,
            plugin ={"pretty", "html:target/HTMLReports/report.html"}

)


public class RegTestRunner {
}
