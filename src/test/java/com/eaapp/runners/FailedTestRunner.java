package com.eaapp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-reports.html"},
        features = "@target/rerun.txt",
        glue = "com/dgmarkt/stepDefinitions"
)
public class FailedTestRunner {
}
