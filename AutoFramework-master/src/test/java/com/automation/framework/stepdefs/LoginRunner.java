package com.automation.framework.stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/main/resources/features/test.feature",
        glue = "com.automation.framework.stepdefs",
tags = "@dev")
public class LoginRunner extends AbstractTestNGCucumberTests {
}
