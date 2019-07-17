package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test1 {
	@Test
	public void getWetherDetails(){
		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.request(Method.GET);
		
		String responseBody = response.getBody().asString();
		
		System.out.println(" Response body is ... [" + response.getStatusCode() + "] " + responseBody);
		Assert.assertEquals(response.getStatusCode() , 200);
		Assert.assertNotNull(responseBody);
		//Matchers.
	}
	

}
