package restAssured;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;

public class Test2 {
 @Test
 public void RegisterPage(){
	 RestAssured.baseURI = "";
	 RequestSpecification request = RestAssured.given();
	 JSONObject requestParams = new JSONObject();
	 
	 requestParams.put("FirstName", "Arthi");
	 requestParams.put("LastName", "Kumar");
	 requestParams.put("UserName", "arthimnai");
	 requestParams.put("Password", "Pass");
	 requestParams.put("Email", "arthi@gmail.com");
	 
	 request.body(requestParams.toJSONString());
	 Response response = request.post("Register");
	 
	 int StatusCode = response.getStatusCode();
	 System.out.println("The status code recieved: " + StatusCode);
	 Assert.assertEquals(StatusCode, "201");
	 
	 String SucessCode = response.jsonPath().getString("SucessCode");
	 System.out.println("REsponseBody is ......" + response.body().asString());
	 Assert.assertEquals("Correct SucessCode", SucessCode);
	 
	 
	 
 }
}
