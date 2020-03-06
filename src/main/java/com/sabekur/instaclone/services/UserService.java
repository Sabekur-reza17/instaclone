package com.sabekur.instaclone.services;

import com.sabekur.instaclone.models.User;
import com.sabekur.instaclone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void register(User user) {
        userRepository.save(user);

    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
