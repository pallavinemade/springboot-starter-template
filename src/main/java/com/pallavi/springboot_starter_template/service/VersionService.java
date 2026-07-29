package com.pallavi.springboot_starter_template.service;

import org.springframework.stereotype.Service;

@Service
public class VersionService {

    public String getVersion() {
        return "1.0.0";
    }
}
