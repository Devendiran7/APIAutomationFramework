package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.pojo.models.request.LoginRequest;
import com.api.pojo.models.response.LoginResponse;
import io.restassured.response.Response;

public class LoginApiTest2 {

	@Test(description = "Verify if Login API is working")
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
	AuthService authService = new AuthService();
	Response response = authService.login(loginRequest);
	
	LoginResponse loginResponse = response.as(LoginResponse.class);
	System.out.println(response.asPrettyString());
	System.out.println(loginResponse.getToken());
	Assert.assertEquals(loginResponse.getEmail(),"Rajesh12@gmail.com");
	Assert.assertEquals(loginResponse.getId(),1);
	Assert.assertEquals(loginResponse.getUsername(),"uday1234");
	}
	
	
	@Test(description = "Verify if Login API is working")
	public void signupTest() {
		LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
	AuthService authService = new AuthService();
	Response response = authService.login(loginRequest);
	
	LoginResponse loginResponse = response.as(LoginResponse.class);
	System.out.println(response.asPrettyString());
	System.out.println(loginResponse.getToken());
	Assert.assertEquals(loginResponse.getEmail(),"Rajesh12@gmail.com");
	Assert.assertEquals(loginResponse.getId(),1);
	Assert.assertEquals(loginResponse.getUsername(),"uday1234");

	}

	
}
