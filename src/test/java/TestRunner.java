import org.junit.runner.RunWith;

import cucumber.api.junit.*;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty",
        "html:build/test-results/test-report"},
        features={"src/test/resources"},
        glue = "",
        monochrome = true,
        tags={"@SmokeTest2"})
public class TestRunner { }
