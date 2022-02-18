package Kris.Sanchez.LIDP.user.controllers;
import Kris.Sanchez.LIDP.user.model.User;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users/get")
    public List<User> getAllPosts(){
        return
    }

    @PostMapping ("/users/post")
    public void addNewUser (@RequestBody User user){

    }






}
