package com.github.mgljava.mybatis.dao;

import com.github.mgljava.mybatis.entity.User;
import java.util.List;

public interface UserMapper {

  List<User> findAll();

  User findUserById(Long id);
}
