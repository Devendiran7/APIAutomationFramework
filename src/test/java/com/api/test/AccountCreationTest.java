package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.pojo.models.request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Account creation")
	public void createAccountTest() {

		SignupRequest signupRequest = new SignupRequest.Builder().username("Deva123").email("Deva21@gmail.com")
				.firstName("Dev1").password("Deva1223").lastName("R").mobileNumber("7777777777").build();


		AuthService authService = new AuthService();
		Response response = authService.sigup(signupRequest);
//		Response response = authService.forgotPassword("TestAutomation#gmail.com");

		
		System.out.println(response.asPrettyString());

//		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
