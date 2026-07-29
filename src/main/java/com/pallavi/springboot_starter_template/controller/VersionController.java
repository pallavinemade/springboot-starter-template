package com.pallavi.springboot_starter_template.controller;

import com.pallavi.springboot_starter_template.service.VersionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class VersionController {

    private final VersionService versionService;

    @GetMapping("/version")
    public Map<String, String> getVersion() {
        return Map.of(
                "application","springboot-starter-template",
                "version",versionService.getVersion()
        );
    }
}
