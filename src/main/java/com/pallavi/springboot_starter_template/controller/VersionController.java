package com.pallavi.springboot_starter_template.controller;

import com.pallavi.springboot_starter_template.service.VersionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * REST controller that exposes application metadata endpoints.
 *
 * <p>Currently exposes an endpoint to retrieve the application's name and version.
 * The version value is resolved via {@link VersionService}.</p>
 *
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class VersionController {

    /** Service used to obtain the application's version. Injected via constructor. */
    private final VersionService versionService;

    /**
     * GET /api/version
     *
     * <p>Return a small JSON object with the application name and current version. Example:
     * {@code {"application":"springboot-starter-template","version":"0.0.1"}}</p>
     *
     * @return a map with keys "application" and "version". The "version" value is provided by
     *         {@link VersionService#getVersion()}.
     */
    @Operation(summary = "Get Application Version", description = "Returns the current version of the application.")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved application version.")
    @ApiResponse(responseCode = "500", description = "Failed to retrieve application version.")
    @GetMapping("/version")
    public Map<String, String> getVersion() {
        return Map.of(
                "application","springboot-starter-template",
                "version",versionService.getVersion()
        );
    }
}
