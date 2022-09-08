Feature: Test scenario for Amazon WebPage

Scenario: Add item to cart

  Given User is on the "Home Page"

  When User chooses random category of products on the "Home Page"
  And User chooses random item from selected category on the "Category Page"
  And User adds selected item to the cart by clicking on Add to cart button on the "Product Page"

  Then Addition confirmation text "Added to Cart" is visible on the "Add To Cart Confirmation Page"
  And Amount of items added to the cart equals "1" on the "Add To Cart Confirmation Page"