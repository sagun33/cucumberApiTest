package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features="src/test/resources/features/api_features",
        glue= {"stepdefinitions", "hooks"},
        tags="@TC01_Api" ,
        dryRun= false

)


public class Runner {

}