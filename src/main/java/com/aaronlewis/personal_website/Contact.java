package com.aaronlewis.personal_website;

import org.springframework.data.annotation.Id;

public class Contact {
	@Id
	public String id;
	public String creatorId;
	
	public String firstName;
	public String lastName;

	public String linkedInUrl;
	public String gitHubUrl;
	public String email;
	public String skypeUrl;
	public String phone;

	public String street;
	public String city;
	public String state;
	public String zipcode;

	Contact() {}
	Contact(String creatorId) {
		this.creatorId = creatorId;
	}
	public Contact(String creatorId, String firstName, String lastName, String linkedInUrl, String gitHubUrl, String email, String skypeUrl, String phone,
			String street, String city, String state, String zipcode) {
		super();
		this.creatorId = creatorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.linkedInUrl = linkedInUrl;
		this.gitHubUrl = gitHubUrl;
		this.email = email;
		this.skypeUrl = skypeUrl;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


}
