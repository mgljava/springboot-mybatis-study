package com.github.mgljava.mybatis.service;

import com.github.mgljava.mybatis.dao.UserMapper;
import com.github.mgljava.mybatis.entity.User;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserMapper userMapper;

  public List<User> getAll() {
    return userMapper.findAll();
  }

  public User findUserById(Long id) {
    return userMapper.findUserById(id);
  }
}
