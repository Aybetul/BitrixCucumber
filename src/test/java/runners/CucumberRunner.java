package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "src\\test\\java\\step_definitions",
        features = "src\\test\\resources\\features",
//        dryRun = false,
//        strict = true,
        tags="",
        plugin= {"html:target/default-report",
                "json:target/cucumber1.json"
        }
)



public class CucumberRunner {
}
