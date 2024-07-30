package me_dio.spring_rest_api.service;

import me_dio.spring_rest_api.model.User;
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}