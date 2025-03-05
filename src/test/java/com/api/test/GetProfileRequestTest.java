package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.pojo.models.request.LoginRequest;
import com.api.pojo.models.response.LoginResponse;
import com.api.pojo.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	@Test(description = "Test the Get Profile...")
	public void getProfileInfoTest() {

		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponse = response.as(LoginResponse.class);

		System.out.println(loginResponse.getToken());

		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();

		response = userProfileManagementService.getProfile(loginResponse.getToken());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getUsername());

	}

}
