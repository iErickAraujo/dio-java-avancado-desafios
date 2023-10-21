package edu.service;

import edu.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
