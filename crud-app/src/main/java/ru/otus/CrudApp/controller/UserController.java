package ru.otus.CrudApp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.otus.CrudApp.model.User;
import ru.otus.CrudApp.service.UserService;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "user deleted")
    public void deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Long userId, @RequestBody User user) {
        user.setId(userId);
        userService.updateUser(user);
    }
}
