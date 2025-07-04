@tag
Feature: naaptol product checkout
  I want to use this template for my feature file

  @tag1
  Scenario: login and place the order
    Given i launch naaptol website
    When I click on login button
    And I enter phone number
    And click on continue
    And navigate to home and kitchen section
    And slected the product
    And I click on buy
    And enter firstname
    And enter lastname
    And enter mobile number
    And enter address
    And enter landmark
    And enter pincode
    And select state
    And select city
    And click on complete order
    Then I see order confirmation meassage
