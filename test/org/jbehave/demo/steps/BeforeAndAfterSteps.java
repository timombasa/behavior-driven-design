package org.jbehave.demo.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.openqa.selenium.WebDriver;

public class BeforeAndAfterSteps {

    private WebDriver driver;

    public BeforeAndAfterSteps(WebDriver driver) {
        this.driver = driver;
    }

    @AfterStories
    @AfterScenario(uponOutcome = AfterScenario.Outcome.FAILURE)
    public void quitBrowser() {
        driver.quit();
    }
}
