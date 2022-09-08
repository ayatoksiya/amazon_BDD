package org.example.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobject.pages.RemoveFromCartConfirmationPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class RemoveFromCartConfirmationPageSteps {
    @Then("Removal confirmation text {string} is visible on the {string}")
    public void removalConfirmationTextIsVisibleOntThe(String confirmationText, String pageName) {
        String text = ((RemoveFromCartConfirmationPage) PAGES_STORAGE.get(pageName)).checkIfRemovedFromCartText();
        Assert.assertEquals(text, confirmationText);
    }

    @And("Final prize of the content of the cart equals {string} on the {string}")
    public void finalPrizeOfTheContentOfTheCartEqualsOnThe(String finalPrize, String pageName) {
        String prize = ((RemoveFromCartConfirmationPage) PAGES_STORAGE.get(pageName)).checkIfRemovedFromCartPrice();
        Assert.assertEquals(prize, finalPrize);
    }
}
