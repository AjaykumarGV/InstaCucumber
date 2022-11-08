Feature: 
  To validate a Login functionality of Instagram application

  @sanity
  Scenario: 
    To validate a login functionality with Invalid username and Invalid password

    When User have to enter invalid username and invalid password
      | Email           | Username  | Password  |
      | ajay@gmail.com  | Ajaykumar | ajay1234  |
      | gokul@gmail.com | Gokulraj  | gokul1234 |
    And User have to click login button

  @smoke
  Scenario Outline: 
    
    To validate a login functionality with valid username and invalid password

    When User have to enter valid "<username>" and invalid "<password>"
    And User have to click Login button

    Examples: 
      | username    | password  |
      | tamil kumar | tamil8392 |
      | tharik      | tha7229   |
      | vikram      | vik8su    |
      | richard     | rich3338  |
