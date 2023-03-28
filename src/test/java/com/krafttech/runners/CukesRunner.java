package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/krafttech/steps_defs",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
