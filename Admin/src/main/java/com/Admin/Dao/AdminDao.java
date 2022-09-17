package com.Admin.Dao;

import com.Admin.Entity.User_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<User_info, Long>
{
	
}
