Feature: Api  Test one

  @tag
  Scenario: CRED
    Given Check test
    When Test does not exist
    Then Create test
    And Delete Test

