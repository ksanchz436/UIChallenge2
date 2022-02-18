package Kris.Sanchez.LIDP.user.controllers;
import Kris.Sanchez.LIDP.user.Service.UserServiceImpl;

import Kris.Sanchez.LIDP.user.model.User;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping("/users/get")
    public List <User> getAllPosts(){

        return userService.getAllUsers();
    }

    @PostMapping ("/users/post")
    public void addNewUser (@RequestBody User user){

        userService.addNewUser(user);

    }


}
