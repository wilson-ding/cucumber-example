import org.junit.runner.RunWith;

import cucumber.api.junit.*;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty",
        "html:build/test-results/test-report",
        "json:target/Destination/cucumber.json"},
        features={"src/test/resources"},
        glue = "",
        monochrome = true,
        tags={"@SmokeTest"})
public class TestRunner { }