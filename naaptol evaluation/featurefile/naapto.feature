@tag
Feature: naaptol product checkout

  @tag1
  Scenario: login and place complete order
    Given i launch naaptol website
    When I click on login button
    And I enter phone number
    And click on continue
    And submit the otp
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
