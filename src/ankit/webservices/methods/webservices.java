package ankit.webservices.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class webservices {
	public static Response post(String URI, String Json) 
	{
		RequestSpecification requestSpecification=RestAssured.given().body(Json).contentType(ContentType.JSON);
		Response response=requestSpecification.post(URI);		
	return response;
	}
	public static Response get(String URI) 
	{
		Response response=RestAssured.given().contentType(ContentType.JSON).get(URI);		
	return response;
	}
	public static Response put(String URI, String Json) 
	{
		RequestSpecification requestSpecification=RestAssured.given().body(Json).contentType(ContentType.JSON);
		Response response=requestSpecification.get(URI);
	return response;
	}
	public static Response delete(String URI) 
	{
		RequestSpecification requestSpecification=RestAssured.given().contentType(ContentType.JSON);
		Response response=requestSpecification.delete(URI);
		return response;
	}
}
