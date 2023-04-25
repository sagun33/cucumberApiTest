package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        System.out.println(generateToken());
    }

    public static String generateToken(){
        String postBody = "{ \"password\": \"485424698\",  \"username\": \"Admin\"\n" +"}";

        Response response = given().contentType(ContentType.JSON).body(postBody).post("http://209.38.244.227/auth/login");

        return response.jsonPath().getString("token");

    }

}