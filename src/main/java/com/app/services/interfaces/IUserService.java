package com.app.services.interfaces;

import com.app.entities.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
}
