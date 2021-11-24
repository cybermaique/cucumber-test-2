package com.content.Run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = { "StepDefinitions" }
)

public class Run extends AbstractTestNGCucumberTests {
}