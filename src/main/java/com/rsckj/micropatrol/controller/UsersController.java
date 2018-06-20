package com.rsckj.micropatrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rsckj.micropatrol.po.Users;
import com.rsckj.micropatrol.service.UsersService;
@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/users",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Users> findAll(){
		List<Users> findAll = usersService.findAll();
		return findAll;
	};
}
