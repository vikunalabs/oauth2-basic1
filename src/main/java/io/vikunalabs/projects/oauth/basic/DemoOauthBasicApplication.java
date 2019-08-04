package io.vikunalabs.projects.oauth.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class DemoOauthBasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoOauthBasicApplication.class, args);
    }
}
