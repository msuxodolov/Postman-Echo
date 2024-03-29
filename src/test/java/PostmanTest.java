import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void PostmanTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Лхаса - столица Тибета")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo( "Лхаса - столица Тибета"))
        ;
        ;
    }
}
