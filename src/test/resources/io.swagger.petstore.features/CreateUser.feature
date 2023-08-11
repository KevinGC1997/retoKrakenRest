Feature: Create user service

  Scenario: Successful creation of a user in petStore
    Given  A user send the request to create a new user in the endpoint "https://petstore.swagger.io/v2/user"
      | id        | 1111              |
      | username  | Pepito            |
      | firstName | Pepito            |
      | lastName  | perez             |
      | email     | ppepito@gmail.com |
      | password  | 1234              |
      | phone     | 3133445566        |

    Then Validate that the status code is 200
    And Validate that the response must be "src\test\resources\Structures\CreateUserEstructure.json"
    And Validate that the response contains the key "type" must be "unknown"
    And Validate that the response  "message" must be "1111"


