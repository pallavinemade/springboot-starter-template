package com.pallavi.springboot_starter_template.service;

import org.springframework.stereotype.Service;

/**
 * Service class for managing application version information.
 * Provides methods to retrieve the current version of the application.
 */
@Service
public class VersionService {

    /**
     * Retrieves the current version of the application.
     *
     * @return a String representing the application version in semantic versioning format
     */
    public String getVersion() {
        return "1.0.0";
    }
}
