package org.example.stepdefinitions;
import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobject.pages.AddToCartConfirmationPage;
import org.testng.Assert;

public class AddToCartConfirmationPageSteps {
    @Then("Addition confirmation text {string} is visible on the {string}")
    public void additionConfirmationTextIsVisibleOnThe(String confirmationText, String pageName) {
        String text = ((AddToCartConfirmationPage) PAGES_STORAGE.get(pageName)).checkIfAddedToCartText();
        Assert.assertEquals(text, confirmationText);
    }

    @And("Amount of items added to the cart equals {string} on the {string}")
    public void amountOfItemsAddedToTheCartEqualsOnThe(String itemsAmount, String pageName) {
        String amount = ((AddToCartConfirmationPage) PAGES_STORAGE.get(pageName)).checkIfAddedToCartCount();
        Assert.assertEquals(amount, itemsAmount);
    }

    @Then("User goes to Cart Page by clicking on the Cart Item on the {string}")
    public void userGoesToByClickingOnTheCartItemOnThe(String pageName) {
        PAGES_STORAGE.put("Cart Page", ((AddToCartConfirmationPage) PAGES_STORAGE.get(pageName)).openCart());
    }
}
