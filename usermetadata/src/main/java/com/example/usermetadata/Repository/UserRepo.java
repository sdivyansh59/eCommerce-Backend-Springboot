package com.example.usermetadata.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.usermetadata.Entity.UserMetaData;

public interface UserRepo  extends CrudRepository<UserMetaData, Long>{
	UserMetaData save(UserMetaData userdata);
	UserMetaData findAllByuniqueId(String uniqueId);
}
