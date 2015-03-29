Feature: Calculator

  Scenario: Adding 2 numbers
    Given var 'x' equal '2'
    And var 'y' equal '3'
    When user 'add' numbers vars 'x' and 'y'
    Then the result is '5'

  Scenario: Adding 2 numbers fails
    Given var 'x' equal '2'
    And var 'y' equal '3'
    When user 'add' numbers vars 'x' and 'y'
    Then the result is '7'

  Scenario: Adding 2 numbers new
    Given var 'x' equal '2'
    And var 'y' equal '3'
    When user 'add' numbers vars 'x' and 'y'
    Then the result is '5'

  Scenario: Adding 2 numbers fails new
    Given var 'x' equal '2'
    And var 'y' equal '3'
    When user 'add' numbers vars 'x' and 'y'
    Then the result is '7'