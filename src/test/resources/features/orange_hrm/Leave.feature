Feature: Orange HRM - CRUD Employee Data

  Background:
    Given I open Orange HRM login page
    When I input username and password
    And I click login button
    And I access employee list

    @hrmentitlement
  Scenario: User add Orange HRM employee leave successfully
    When I add entitlements employee with required field only
    Then I can see Leave Entitlements detail

  Scenario: User read Orange HRM employee leave list successfully
    Then I can see new employee leave list result