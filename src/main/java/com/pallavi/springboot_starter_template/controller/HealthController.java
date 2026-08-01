package com.pallavi.springboot_starter_template.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * REST controller for application health check endpoints.
 * Provides endpoints to monitor the health status of the application.
 */
@RestController
@RequestMapping("/api")
public class HealthController {

    /**
     * Performs a health check and returns the application's health status.
     *
     * @return a map containing the health status with key "status" and value "UP"
     */
    @Operation(summary = "Health Check Endpoint", description = "Returns the health status of the application.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Application is healthy."),
            @ApiResponse(responseCode = "500", description = "Application is unhealthy.")
    })
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
