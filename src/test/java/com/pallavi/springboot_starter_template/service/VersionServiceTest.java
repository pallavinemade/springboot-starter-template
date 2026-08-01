package com.pallavi.springboot_starter_template.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

/** Unit test for {@link VersionService}. */
@ExtendWith(MockitoExtension.class)
public class VersionServiceTest {

    @InjectMocks
    private VersionService versionService;

    @Test
    void testGetVersion(){
        assertThat(versionService.getVersion()).isEqualTo("1.0.0");
    }
}
