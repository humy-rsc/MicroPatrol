package com.rsckj.micropatrol.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsckj.micropatrol.mapper.ext.UsersExtMapper;
import com.rsckj.micropatrol.po.Users;
import com.rsckj.micropatrol.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersExtMapper usersExtMapper;
	@Override
	public List<Users> findAll() {
		return usersExtMapper.findAll();
	}
	
	
	
	
	
	public UsersExtMapper getUsersExtMapper() {
		return usersExtMapper;
	}
	public void setUsersExtMapper(UsersExtMapper usersExtMapper) {
		this.usersExtMapper = usersExtMapper;
	}
	
	

}
