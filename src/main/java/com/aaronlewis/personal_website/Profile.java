package com.aaronlewis.personal_website;

import org.springframework.data.annotation.Id;


public class Profile {

	@Id
	public String id;
	public String creatorId;

	public String aboutParagraph;
	public String profileParagraph;

	public String skillsParagraph;

	public Profile() {}

	public Profile(String creatorId) {
		this.creatorId = creatorId;
	}


	public Profile(String creatorId, String aboutParagraph, String profileParagraph,
			String skillsParagraph) {
		super();
		this.creatorId = creatorId;
		this.aboutParagraph = aboutParagraph;
		this.profileParagraph = profileParagraph;
		this.skillsParagraph = skillsParagraph;
	}

}