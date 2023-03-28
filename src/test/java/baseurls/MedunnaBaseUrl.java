package baseurls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void medunnaSetUp(){

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("https://medunna.com").build();

    }
}