package com.restapiexample.dummy.restapiinfo;

import com.restapiexample.dummy.model.RestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiPostTest extends TestBase {

    @Test
    public void createEmployeeTest() {
        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("Nehal Patel");
        restApiPojo.setSalary("55000");
        restApiPojo.setAge("35");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
