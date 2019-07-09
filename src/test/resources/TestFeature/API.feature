Feature:
  Scenario Outline: First POST request scenario

    Given User is Authorizng to create POST
    When USer creates post with <title> and <content>
    Then User gets 201 response

    Examples:
    |title |content |
    |      |        |
