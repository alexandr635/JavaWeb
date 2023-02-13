package com.app.services.implementation;

import com.app.entities.User;
import com.app.repositories.UserRepository;
import com.app.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>)userRepository.findAll();
    }
}
