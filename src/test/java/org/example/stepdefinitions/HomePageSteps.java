package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.HomePage;
import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;
import static org.example.stepdefinitions.BaseSteps.webDriver;

public class HomePageSteps {
    @Given("User is on the {string}")
    public void userIsOnThe(String pageName) {
        HomePage homePage = new HomePage(webDriver);
        PAGES_STORAGE.put(pageName, homePage);
        homePage.open();
    }

    @When("User chooses random category of products on the {string}")
    public void userChoosesRandomCategoryOfProducts(String pageName) {
        PAGES_STORAGE.put("Category Page",((HomePage) PAGES_STORAGE.get(pageName)).openCategory());
    }
}
