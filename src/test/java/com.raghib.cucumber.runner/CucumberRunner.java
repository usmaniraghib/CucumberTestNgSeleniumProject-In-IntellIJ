package com.raghib.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.raghib.cucumber.stepdefination"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
