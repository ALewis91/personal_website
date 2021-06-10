package com.aaronlewis.personal_website;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "profile", path = "profile")
public interface ProfileRepository extends MongoRepository<Profile, String> {
	
	  public Profile findByCreatorId(@Param("creatorId") String creatorId);

}
