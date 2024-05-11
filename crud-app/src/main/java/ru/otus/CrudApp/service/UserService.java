package ru.otus.CrudApp.service;

import ru.otus.CrudApp.model.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);
}
