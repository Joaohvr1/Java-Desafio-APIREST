package me.dio.restapi.service;

import me.dio.restapi.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
