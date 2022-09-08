package org.example.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {

    protected CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    private WebElement RemoveButton;

    public RemoveFromCartConfirmationPage removeProduct() {
        this.RemoveButton = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath("//input[@value=\"Delete\"]")));
        this.RemoveButton.click();
        return new RemoveFromCartConfirmationPage(webDriver);
    }
}

