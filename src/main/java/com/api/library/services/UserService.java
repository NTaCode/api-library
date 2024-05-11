package com.api.library.services;

import com.api.library.entities.User;
import com.api.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUserById(long userId){
        return userRepository.findById(userId);
    }

    public void deleteById(long userId){
        userRepository.deleteById(userId);
    }
}
