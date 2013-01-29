package org.jbehave.demo.steps;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BioPage {
    WebDriver driver;

    public BioPage(WebDriver driver) {
        this.driver = driver;
    }

    @Then("I should be on Martin Fowler's bio page")
    public void verifyMartinFowler() {
        String about = driver.findElement(By.cssSelector(".profile_header h1")).getText();
        assertThat(about, is(equalTo("Martin Fowler")));
    }
}
