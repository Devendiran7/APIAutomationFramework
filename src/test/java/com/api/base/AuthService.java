package com.api.base;

import java.util.HashMap;

import com.api.pojo.models.request.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH = "/api/auth/";

	public Response login(Object payload) {
		return postRequest(payload, BASE_PATH + "login");
	}

	public Response forgotPassword(String email) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email",  email);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}

	public Response resetPassword(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "reset-password");
	}

	public Response sigup(Object payload) {
		return postRequest(payload, BASE_PATH + "signup");
	}

}
