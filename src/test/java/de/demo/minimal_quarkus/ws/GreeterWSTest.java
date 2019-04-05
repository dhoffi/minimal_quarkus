package de.demo.minimal_quarkus.ws;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreeterWSTest {

    @Test
    public void testHelloEndpoint() {
        given().when().get("/hello").then().statusCode(200).body(is("Hello World!"));
    }

    @Test
    public void testGreetEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given().pathParam("name", uuid).when().get("/hello/greet/{name}").then().statusCode(200)
                .body(is("Hello " + uuid + "?"));
    }

}