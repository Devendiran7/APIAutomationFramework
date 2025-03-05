package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)
public class LoginApiTest {
	
//	@Test(description = "Verify if Login API is working....")
//	public void name() {
//		RestAssured.baseURI= "http://64.227.160.186:8080";
//		RequestSpecification x = RestAssured.given();
//		RequestSpecification y = x.header("Content-type","application/json");
//		RequestSpecification z = y.body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}");
//		Response response = z.post("/api/auth/login");
//		System.out.println(response.asPrettyString());
//
//	}
	@Test(description = "Verify if Login API is working")
	public void loginTest() {
	

		Response response = given().
				baseUri("http://64.227.160.186:8080").header("Content-type","application/json").body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
