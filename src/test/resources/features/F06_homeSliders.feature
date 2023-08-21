Feature: HomeSlider
  Scenario: First Slider Is Clickable On Home Page
    Given User is in home page
    When User Click On Frist Slider
    Then The Web Page Should Direct To the Nokia WebSite

    Scenario: second slider is clickable on home page
      Given User is in home page
      When User Click On Second Slider
      Then The Web Page Should Direct To the Iphone WebSite

