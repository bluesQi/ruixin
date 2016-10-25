package com.ruixin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ruixin.dao.UserDAO;
import com.ruixin.domain.User;

@Controller
@RequestMapping(value = "/hello")
public class HelloController2 {
//	@Resource
//	private UserDAO userDAO;
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView getFirstPage() {
//		List<User> users = userDAO.getUsers();
//		for(User u:users){
//			System.out.println(u);
//		}
		// welcom就是视图的名称（welcome.ftl）
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("name", "this is freemaker test!!!");
		return mv;
	}
//	public UserDAO getUserDAO() {
//		return userDAO;
//	}
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}

}
