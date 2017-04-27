@raja
Feature: As a User
  I want to navigate to the Desktop categories page and
  I want to add Lenovo IdeaCentre 600 All-in-One PC in to Shopping cart

  Scenario: I should be navigate to Desktop Category Successfully
    Given I am on HomePage
    When I Click on Computer Category
    And I Click on Desktop Category
    Then I navigate to Desktop Category Successfully

    Scenario: I Should able Add Lenovo IdeaCentre 600 All-in-One PC in to Shopping cart Successfully
      Given I on Desktop Category page
      When I click on Add To Cart Tab of Lenovo IdeaCentre 600 All-in-One PC Product
      Then Product Successfully added to Shopping Cart