package org.jbehave.demo.steps;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;

public class AboutUsPage{

    WebDriver driver;

	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
	}

    @Given("I am on the ThoughtWorks about us page")
    public void visit() {
        driver.get("http://www.thoughtworks.com/about-us");
    }
}
