Feature: Marketing Login

  This caracteristic is about a login from
  SmartPyme Marketing for make campaigns

  Scenario: Verify Login Passed
    Given I am at SmartPyme Marketing Web Site
    When I write my username "amoscoso"
    And I write my password "123456"
    And I select the Sign In Button
    Then I verify what the label Admistration is "ALAIN MARCEL MOSCOSO MORALES"