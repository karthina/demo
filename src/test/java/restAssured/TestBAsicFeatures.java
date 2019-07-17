package restAssured;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class TestBAsicFeatures {
	
	/*Simply checking status code*/
	//@Test
	public void testStatusCode(){
		given().
		get("https://jsonplaceholder.typicode.com/posts/3").
		then().
		statusCode(200);
	}
	
	/*it will verify code and print complete response in console*/
	
	//@Test
	public void testLogging(){
		given().
		get("https://services.groupkt.com/country/get/iso2code/in").
		then().statusCode(200).
		log().all();
	}
	
	}



