package com.aaronlewis.personal_website;

import org.springframework.data.annotation.Id;

public class Skill {

	@Id
	public String id;
	public String creatorId;
	
	public String skillTitle;
	public int skillLevel;
	
	
	Skill(String creatorId, String skillTitle, int skillLevel) {
		this.creatorId = creatorId;
		this.skillTitle = skillTitle;
		this.skillLevel = skillLevel;
	}


	@Override
	public String toString() {
		return "Skill [id=" + id + ", creatorId=" + creatorId + ", skillTitle=" + skillTitle + ", skillLevel="
				+ skillLevel + "]";
	}


	
}
