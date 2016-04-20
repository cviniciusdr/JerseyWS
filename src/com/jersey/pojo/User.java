package com.jersey.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
public class User implements Serializable {

	private static final long serialVersionUID = -6063809699674958707L;

	private int id;
	private String userName;
	private String password;
	private String address;
	private String email;

	@JsonCreator
	public User(@JsonProperty("id") int id, @JsonProperty("user") String user,
			@JsonProperty("password") String password, @JsonProperty("address") String address,
			@JsonProperty("email") String email) {
		this.id = id;
		this.userName = user;
		this.password = password;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password
				+ ", address=" + address + ", email=" + email + "]";
	}

	
}
