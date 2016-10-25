package com.ruixin.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.ruixin.dao.UserDAO;
import com.ruixin.domain.User;
import com.ruixin.domain.UserMapper;

public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {

	public List<User> getUsers() {
		String sql = "select * from d_user";
		List<User> list = this.getJdbcTemplate().query(sql, new UserMapper());
		return list;
	}

}
