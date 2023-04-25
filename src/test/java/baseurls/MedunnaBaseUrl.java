package baseurls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utils.Authentication.generateToken;


public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void medunnaSetUp(){


        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer "+generateToken()).
                setBaseUri("https://medunna.com").build();

    }




}
/*
batch_yuzuc
==> Batch.103
 */