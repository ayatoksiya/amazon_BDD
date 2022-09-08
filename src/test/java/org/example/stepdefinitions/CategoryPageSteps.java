package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import org.example.pageobject.pages.CategoryPage;


import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class CategoryPageSteps {
    @And("User chooses random item from selected category on the {string}")
    public void userChoosesRandomItemFromSelectedCategoryOnThe(String pageName) {
        PAGES_STORAGE.put("Product Page",((CategoryPage) PAGES_STORAGE.get(pageName)).openProduct());
    }
}
