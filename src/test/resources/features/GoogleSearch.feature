Feature: Google Search
  As a user
  I want to search on Google
  So that I can find relevant information

  @Clover
  Scenario: Searching on Google
    Given I Open Google
    When I search for "Clover"
    Then I should see "Clover" is present in the "1st" result
