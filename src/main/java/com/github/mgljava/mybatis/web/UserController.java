package com.github.mgljava.mybatis.web;

import com.github.mgljava.mybatis.entity.User;
import com.github.mgljava.mybatis.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

  private final UserService userService;

  @GetMapping
  public List<User> getAll() {
    return userService.getAll();
  }

  @GetMapping(value = "/{id}")
  public User getUserById(@PathVariable("id") Long id) {
    return userService.findUserById(id);
  }

  @GetMapping(value = "/insert")
  public void insertUser(String username, String address) {
    userService.insertUser(new User(0L, username, address));
  }

  @GetMapping(value = "/update/{id}")
  public void updateUser(@PathVariable("id") Long id, String username, String address) {
    userService.updateUser(new User(id, username, address));
  }
}
