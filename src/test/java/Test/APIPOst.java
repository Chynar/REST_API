package Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APIPOst {
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://www.chynar.dev.cc/wp-json";
        RestAssured.basePath = "wp/v2/posts";
    }

    @Test
    public void PostReq(){
        Map<String,Object> mapReq=new HashMap<>();
        mapReq.put("title","making new Post with Java code");
        mapReq.put("content","sending new Post with Java code");
        given().relaxedHTTPSValidation().auth().preemptive().basic("admin","admin").contentType(ContentType.JSON)
                .when().body(mapReq).log().all().post().then().log().all().statusCode(201);

    }

    @Test
    public void firstPost(){
        Map<String,Object> firstPost=new HashMap<>();
        firstPost.put("title","Creating my first Post with Java code");
        firstPost.put("content","I just copy paste and changed some parts))) ");
        given().relaxedHTTPSValidation().auth().preemptive().basic("admin","admin").contentType(ContentType.JSON)
                .when().body(firstPost).log().all().post().then().log().all().statusCode(201);

    }
    @Test
    public void secondPost(){
        Map<String,Object> secondPost=new HashMap<>();
        secondPost.put("title","2nd Post with Java code");
        secondPost.put("content","Sending 2nd Post with Java code");
        given().relaxedHTTPSValidation().auth().preemptive().basic("admin","admin").contentType(ContentType.JSON)
                .when().body(secondPost).log().all().post().then().log().all().statusCode(201);

    }
    @Test
    public void thirdPost(){
        Map<String,Object> thirdPost=new HashMap<>();
        thirdPost.put("title","Third Post with Java code");
        thirdPost.put("content","Sending third Post with Java code");
        given().relaxedHTTPSValidation().auth().preemptive().basic("admin","admin").contentType(ContentType.JSON)
                .when().body(thirdPost).log().all().post().then().log().all().statusCode(201);

    }
    @Test
    public void forthPost(){
        Map<String,Object> forthPost=new HashMap<>();
        forthPost.put("title","4h Post with Java code");
        forthPost.put("content","Sending forth Post with Java code");
        given().relaxedHTTPSValidation().auth().preemptive().basic("admin","admin").contentType(ContentType.JSON)
                .when().body(forthPost).log().all().post().then().log().all().statusCode(201);

    }
    @Test
    public void fifthPost(){
        Map<String,Object> fifthPost=new HashMap<>();
        fifthPost.put("title","Fifth Post with Java code");
        fifthPost.put("content","Sending 5th Post with Java code");
        given().relaxedHTTPSValidation().auth().preemptive().basic("admin","admin").contentType(ContentType.JSON)
                .when().body(fifthPost).log().all().post().then().log().all().statusCode(201);

    }

}
