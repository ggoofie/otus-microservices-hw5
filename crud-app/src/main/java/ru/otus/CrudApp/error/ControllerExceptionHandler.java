package ru.otus.CrudApp.error;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Error handleException(Exception ex) {
        return new Error(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }

    @ExceptionHandler(value = EntityNotFoundException.class)
    public Error handleEntityNotFoundException(EntityNotFoundException ex) {
        return new Error(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
}
