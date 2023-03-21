package com.yash.dao;

import com.yash.model.Role;
import com.yash.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 //done

@Repository
public interface UserDao extends CrudRepository<User, String>{

	//void save(Role adminRole);

	

}
