package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.pojo.models.request.LoginRequest;
import com.api.pojo.models.request.ProfileRequest;
import com.api.pojo.models.response.LoginResponse;
import com.api.pojo.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test
	public void updateProfile() {

		AuthService authservice =new AuthService();
		Response response = authservice.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("--------------------- --------------------------");
		
		UserProfileManagementService usermanageService = new UserProfileManagementService();
		 response = usermanageService.getProfile(loginResponse.getToken());
		
		System.out.println(response.asPrettyString());
		
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "uday1234");
		
		System.out.println("--------------------- --------------------------");
		
		ProfileRequest profileRequest = new ProfileRequest.Builder().
				firsName("Deva").lastName("R").email("deva@gamil.com").mobileNumber("9234567890").build();
		
		 response = usermanageService.updateProfile(loginResponse.getToken(), profileRequest);
		
		 System.out.println(response.asPrettyString());
	}
	
}
