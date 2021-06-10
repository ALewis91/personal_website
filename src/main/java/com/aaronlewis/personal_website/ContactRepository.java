package com.aaronlewis.personal_website;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "https://www.aaronlewis.dev", maxAge = 3600)
@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactRepository extends MongoRepository<Contact, String> {
	
	  public Contact findByCreatorId(@Param("creatorId") String creatorId);

}
