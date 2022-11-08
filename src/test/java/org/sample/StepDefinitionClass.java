package org.sample;

import java.util.List;
import java.util.Map;

import org.pojo.LoginPojo;

import io.cucumber.java.en.When;

public class StepDefinitionClass extends LoginPojo {

	public static LoginPojo l;

	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable ds) {

		waitWindow();
		List<Map<String, String>> mps = ds.asMaps();
		String user = mps.get(0).get("Username");
		String pass = mps.get(0).get("Password");

		l = new LoginPojo();
		totext(l.getTxtuser(), user);
		totext(l.getTxtpass(), pass);
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {

		btnClick(l.getBtnlogin());

	}

	@When("User have to enter valid {string} and invalid {string}")
	public void user_have_to_enter_valid_and_invalid(String name, String password) {

		waitWindow();
		l =new LoginPojo();
		totext(l.getTxtuser(), name);
		totext(l.getTxtpass(), password);
	}

	@When("User have to click Login button")
	public void user_have_to_click_Login_button() {

		btnClick(l.getBtnlogin());
	}
}
