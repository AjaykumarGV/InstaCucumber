package org.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateReports(String jsonpath) {

		File f = new File(System.getProperty("user.dir") + "\\AllReports\\JVMReport");

		Configuration c = new Configuration(f, "Instagram Application");
		c.addClassifications("Platforms", "Windows 10");
		c.addClassifications("jdk versions", "1.8");

		List<String> li = new ArrayList<String>();
		li.add(jsonpath);

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}
}
