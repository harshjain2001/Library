package org.blackbear;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class LibraryResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/C:/Users/t0282733/AppData/Local/Programs/Git/api/books")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}