package Test;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;


public class apiTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://www.chynar.dev.cc/wp-json";
        RestAssured.basePath = "wp/v2";
    }
    @Test
    public void test1(){
//      when().
        given().relaxedHTTPSValidation().
                get("https://www.chynar.dev.cc/wp-json/wp/v2/posts").
                then().log().all()
                .statusCode(200);
    }
    @Test
    public void getRequest() {
        given().relaxedHTTPSValidation()
                .get("https://www.chynar.dev.cc/wp-json/wp/v2/posts")
                .then().log().all()
                .statusCode(200);
//        .and()
//                .body("[0].id", equalTo(13));
////        .body("id", hasItems(13, 12, 11, 10, 9, 6, 1 ));
    }
    @Test
    public void test2() {
        given().relaxedHTTPSValidation()
                .get("https://www.chynar.dev.cc/wp-json/wp/v2/posts")
                .then().log().all()
                .statusCode(200)
                .and()
                .body("[0].id", equalTo(13));
//        .body("id", hasItems(13, 12, 11, 10, 9, 6, 1 ));
    }
//    @Test
//    public void test3() {
//        assertThat(5, equalTo(5));
//        assertThat(5, not(equalTo(4)));
//        List<Integer> numbers = Arrays.asList(4, 5, 6, 10, 12);
//        assertThat(numbers, hasItems(10, 12));
//        assertThat(numbers, contains(4, 5, 6, 10, 12));
//        assertThat("Techtorial Academy", containsString("Academy"));
//    }
    @Test
    public void test4() {
        given().relaxedHTTPSValidation()
                .get("https://www.chynar.dev.cc/wp-json/wp/v2/posts/13")
                .then().log().all()
                .statusCode(200)
                .and()
                .body("id", equalTo(13));
//        .body("id", hasItems(13, 12, 11, 10, 9, 6, 1 ));
    }
    @Test
    public void test5() {
        given().relaxedHTTPSValidation()
                .get("https://www.chynar.dev.cc/wp-json/wp/v2/posts/{id}", 13)
                .then().log().all()
                .statusCode(200)
                .and()
                .body("id", equalTo(13));
//        .body("id", hasItems(13, 12, 11, 10, 9, 6, 1 ));
    }
    @Test
    public void test6() {
        given().relaxedHTTPSValidation()
                .get("/posts")
                .then().log().all()
                .statusCode(200);
    }
    @Test
    public void test7() {
        given().relaxedHTTPSValidation().pathParam("id", 13)
                .when()
                .get("/{id}")
                .then().log().all();
//                statusCode(200);
    }
    //
//    Response response = given()
//            .baseUri("https://localhost")
//            .basePath("api/users")
//            .pathParam("userid", 2)
//            .when()
//            .get("/{userid}");
}
