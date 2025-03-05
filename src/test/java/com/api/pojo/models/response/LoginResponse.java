package com.api.pojo.models.response;

import java.util.List;

public class LoginResponse {

	private String token;
	private String type;
	private int id;
	private String username;
	private String email;
	private List<String> roles;

	public LoginResponse() {
		// TODO Auto-generated constructor stub
	}

	public LoginResponse(String token, String type, String username, String email, List<String> roles, int id) {
		super();
		this.token = token;
		this.type = type;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.id = id;
	}

	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", type=" + type + ", username=" + username + ", email=" + email
				+ ", roles=" + roles + ", id=" + id + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
