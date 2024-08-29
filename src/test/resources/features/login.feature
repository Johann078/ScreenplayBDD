Feature: Saucedemo Application Functionalities


  Scenario: Successful addition of an item to the cart
    Given the user is on the login page
    When the user enters valid credentials
    And the user adds multiple items to the cart
    And the user clicks on the shopping cart button
    And the user proceeds to checkout
    Then the user completes the checkout process






