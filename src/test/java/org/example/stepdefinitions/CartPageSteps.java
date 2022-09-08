package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import org.example.pageobject.pages.CartPage;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class CartPageSteps {

    @And("User removes the item from the cart by clicking on Remove button on the {string}")
    public void userRemovesTheItemFromTheCartByClickingOnRemoveButtonOnThe(String pageName) {
        PAGES_STORAGE.put("Remove From Cart Confirmation Page",((CartPage) PAGES_STORAGE.get(pageName)).removeProduct());
    }
}
