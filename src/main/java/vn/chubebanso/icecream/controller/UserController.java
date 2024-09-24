package vn.chubebanso.icecream.controller;

import org.springframework.web.bind.annotation.RestController;

import vn.chubebanso.icecream.domain.User;
import vn.chubebanso.icecream.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    final private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public User createUserController(@RequestBody User user) {
        return this.userService.handleCreateUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUser() {
        return this.userService.getAllUser();
    }

}
