package com.demo.appium.steps;

import com.demo.appium.pages.OtherTestPageObject;
import com.demo.appium.pages.TestPageObject;

import net.thucydides.core.annotations.Step;

public class EndUserSteps {

	TestPageObject homeScreen;
	OtherTestPageObject noteScreen;

	@Step
	public void wants_to_add_a_note() {
		homeScreen.addNote();
	}

	@Step
	public void fills_form(String tittle, String description) {
		noteScreen.fill_fields(tittle, description);
	}

	@Step
	public void saves_note() {
		homeScreen.addNote();

	}
}