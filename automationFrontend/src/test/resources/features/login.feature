Feature: Log in into the site
  As QA automation
  I want to log in into LinkedIn
  To validate the flow

  Scenario: Valid log in
    Given user is in the site
    When input the correct log in credentials
      | username         | password |
      | cuadro@gmail.com | 01254200 |
    Then get into the site