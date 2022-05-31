package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiDeleteTest extends TestBase {
    @Test
    public void deleteAllServicesInfo() {
        Response response = given()
                .pathParam("id",1236)
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
