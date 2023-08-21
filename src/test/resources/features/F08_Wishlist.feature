Feature: Wishlist Feature
  Scenario: User Click On WishList Button of the product
    Given User in Home Pagee
    When User Click On Wishlist Button On This Product "HTC One M8 Android L 5.0 Lollipop
    Then User Should See Success Message

    Scenario:show the Wishlist
      Given Useer Go To home page
      When User Click On Wishlist Button On This Product "HTC One M8 Android L Lollipop
      And User Click On Wishlist Button After The Succses Bar disappear
      Then User should get Qty value and verify it's bigger than 0


