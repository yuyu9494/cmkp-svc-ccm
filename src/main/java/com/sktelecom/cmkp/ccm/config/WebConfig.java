package com.sktelecom.cmkp.ccm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig   {
    @Value("${server.port}")
    private final Integer SERVER_PORT = null;
}
