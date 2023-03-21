package com.yash.dao;

import com.yash.model.Role;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//done
@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
