package com.github.mgljava.mybatis.dao;

import com.github.mgljava.mybatis.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

  List<User> findAll();

  User findUserById(Long id);

  void insertUser(User user);

  void updateUser(User user);
}
