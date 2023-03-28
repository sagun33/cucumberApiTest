package stepdefinitions.api_room_creation;

import baseurls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.ApiRoomPojo;

import static baseurls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class APIRoomStepdefinition {

    @Given("user send post request")
    public void user_send_post_request() {

        //get the url
        spec.pathParam("first","rooms");

        //set the expected data
        ApiRoomPojo expectedData=new ApiRoomPojo("projeye dogru adim adim",9999,99,"TWIN",true);

        //send the request and get the response
        given(spec).

    }
    @Then("user send get request")
    public void user_send_get_request() {

    }


}
/*
{

  "description": "projeye dogru adim adim",

  "price": 9999,
  "roomNumber": 99,
  "roomType": "TWIN",
  "status": true
}
 */