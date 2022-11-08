package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sample.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.sample", 
dryRun = false, monochrome = true, strict = true,
plugin = {
		"html:AllReports\\HTMLReport", "json:AllReports\\JSONReport\\instalogin.json",
		"junit:AllReports\\JUNITReport\\login.xml" })
public class TestRunner {

	@AfterClass
	public static void reports() {

		JVMReport.generateReports(System.getProperty("user.dir") + "\\AllReports\\JSONReport\\instalogin.json");

	}
}
