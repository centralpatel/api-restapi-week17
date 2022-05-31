package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiGetTest extends TestBase {

    @Test
    public void getAllEmployeesInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void getSingleServicesInfo() {
        Response response = given()
                .basePath("/employee")
                .pathParam("id",11)
                .when()
                .get("{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
