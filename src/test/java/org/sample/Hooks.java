package org.sample;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public static void bef() {

		launchBrowser();
		launchUrl("https://www.instagram.com/accounts/login/");
		maxWindow();

	}

	@After
	public static void aft() {

		waitWindow();
		quitWindow();

	}

}
