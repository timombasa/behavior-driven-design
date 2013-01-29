package org.jbehave.demo.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Search {
    WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    @When("I search for \"$term\"")
    public void searchForTerm(String term) {
        driver.findElement(By.name("search_block_form")).sendKeys(term);
        driver.findElement(By.name("op")).submit();
    }

    @Then("I should see search results for \"$term\"")
    public void verifyTermResults(String term) {
        String searchTerm = driver.findElement(By.cssSelector(".content .box h2")).getText();
        assertThat(searchTerm, is(equalTo("Search results for: " + term)));
    }

    @When("I open search result titled \"$title\"")
    public void openSearchResult(String title) {
        driver.findElement(By.className("search-results"))
                .findElement(By.linkText(title)).click();
    }
}
