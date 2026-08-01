package com.pallavi.springboot_starter_template.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/**
 * Global exception handler for handling exceptions across the application.
 * This class provides centralized exception handling for REST controllers
 * using the {@link RestControllerAdvice} annotation.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles generic exceptions and returns an appropriate HTTP response.
     *
     * @param e the exception to handle
     * @return a ResponseEntity with HTTP 500 (Internal Server Error) status
     *         and a map containing the error message
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> handleException(Exception e) {
        return ResponseEntity.internalServerError().body(Map.of("Error Message:", e.getMessage()));
    }
}
