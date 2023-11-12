package com.activityApi.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/activityApi/tests/Activity.feature",
        glue = {"com.activityApi.tests"},
        plugin = {"pretty","html:reports/activity-Report.html"},
        monochrome = true
)
public class ActivityTestRunner extends AbstractTestNGCucumberTests {
}
