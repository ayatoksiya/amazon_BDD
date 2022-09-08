Feature: Remove Item Test scenario for Amazon WebPage

  Scenario: Remove item from cart

    Given User is on the "Home Page"

    When User chooses random category of products on the "Home Page"
    And User chooses random item from selected category on the "Category Page"
    And User adds selected item to the cart by clicking on Add to cart button on the "Product Page"
    And Addition confirmation text "Added to Cart" is visible on the "Add To Cart Confirmation Page"
    And Amount of items added to the cart equals "1" on the "Add To Cart Confirmation Page"

    Then User goes to Cart Page by clicking on the Cart Item on the "Add To Cart Confirmation Page"
    And User removes the item from the cart by clicking on Remove button on the "Cart Page"
    And Removal confirmation text "Your Amazon Cart is empty." is visible on the "Remove From Cart Confirmation Page"
    And Final prize of the content of the cart equals "$0.00" on the "Remove From Cart Confirmation Page"
