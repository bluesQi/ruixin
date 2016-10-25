package com.ruixin.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int index) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setSex(rs.getString("sex"));
		user.setAge(rs.getString("age"));
		return user;
	}

}
