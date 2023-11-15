Feature: Fridge
  As a user,
  I want to be able to keep my water bottles in my fridge

  Scenario Outline:
    Given I have <opening balance> water bottles
    And I have drunk <processed> water bottles
    When I go to my fridge
    Then I should have <in stock> water bottles
    Examples:
      | opening balance | processed | in stock |
      | 10              | 1         | 9        |
      | 1               | 1         | 0        |