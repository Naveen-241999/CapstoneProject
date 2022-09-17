package com.Admin.Service;

import com.Admin.Entity.User_info;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService implements ServiceInterface
{
	@Override
	public User_info getuser()
	{
		User_info u = new User_info();
		
		return u;
	}
}
