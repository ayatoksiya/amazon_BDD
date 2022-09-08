package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import org.example.pageobject.pages.ProductPage;
import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class ProductPageSteps {
    @And("User adds selected item to the cart by clicking on Add to cart button on the {string}")
    public void userAddsSelectedItemToTheCartByClickingOnAddToCartButtonOnThe(String pageName) {
        PAGES_STORAGE.put("Add To Cart Confirmation Page",((ProductPage) PAGES_STORAGE.get(pageName)).addProductToCart());
    }
}
