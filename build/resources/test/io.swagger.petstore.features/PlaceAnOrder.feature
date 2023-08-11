Feature: Place an order service

  Scenario: Successful order for a pet
    Given  A user send the request to place an order for pet in the endpoint "https://petstore.swagger.io/v2/store/order"
      | id       | 222                      |
      | petId    | 111                      |
      | quantity | 100                       |
      | shipDate | 2023-08-11T00:02:02.554Z |
      | status   | placed                   |
      | complete | true                     |
    Then Validate in the response that the status code is 200
    And Validate that the response body must be "src\test\resources\Structures\PlaceAnOrderEstructure.json"
    And Validate in the response that the response contains the key "status" must be "placed"
