package com.example.springbootconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DBSetting {

    private String username;
    private String password;
    private String url;

}
