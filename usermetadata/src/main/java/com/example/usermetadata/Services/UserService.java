package com.example.usermetadata.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	// submit the data into the database
	public UserMetaData saveUserMetaData (UserMetaData metaData) {
		return userRepo.save(metaData);
	}
	
	// retrieve the data from database
	public UserMetaData getUserdetailsFromDB(@PathVariable String userId) {
		return userRepo.findAllByuniqueId(userId);
	}

}
