Feature: Users Could Open FollowUs Links
  Scenario:User Open Facebook Link
    Given User is in home page
    When User Click on Facebook Button
    Then User Is Redirected To Facebook Page

    Scenario: User Open Twitter Link
      Given User is in home page
      When User Click on Twitter Button
      Then User Is Redirected To Twitter Page

      Scenario: User Open Rss Link
        Given User is in home page
        When User Click on Rss Button
        Then User Is Redirected To Rss Page

        Scenario: User Open Youtube Link
          Given User is in home page
          When User Click on Youtube Button
          Then User Is Redirected To Youtube Page