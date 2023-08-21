Feature: Currencies
  Scenario: Select Euro currency from the dropdown
    Given User is in home page
    When User Select Euro currency from the dropdown list on the top left of home page
    Then assertion to verify Euro Symbol (€) is shown