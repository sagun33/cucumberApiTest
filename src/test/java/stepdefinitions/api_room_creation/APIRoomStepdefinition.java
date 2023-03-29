package stepdefinitions.api_room_creation;

import baseurls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.bytebuddy.pool.TypePool;
import pojos.ApiRoomPojo;

import static baseurls.MedunnaBaseUrl.*;
import static io.restassured.RestAssured.given;

public class APIRoomStepdefinition {

    @Given("user send post request")
    public void user_send_post_request() {

        //get the url
        spec.pathParams("first","api","second","rooms");

        //set the expected data
        ApiRoomPojo expectedData=new ApiRoomPojo("projeye dogru adim adim",9999,99,"TWIN",true);

        //send the request and get the response
        Response response=given(spec).body(expectedData).post("/{first}/{second}");
        response.prettyPrint();

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