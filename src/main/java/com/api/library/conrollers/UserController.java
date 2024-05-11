package com.api.library.conrollers;

import com.api.library.entities.Book;
import com.api.library.entities.User;
import com.api.library.services.BookService;
import com.api.library.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user")
    public ResponseEntity<User> findUserById(@RequestParam long userId) {
        User user= userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/user")
    public ResponseEntity<User> deleteUserById(@RequestParam long userId) {
       userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
