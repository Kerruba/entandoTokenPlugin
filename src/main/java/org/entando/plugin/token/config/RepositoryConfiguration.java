package org.entando.plugin.token.config;

import org.entando.plugin.token.domain.TokenEventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Bean
    TokenEventHandler tokenEventHandler() {
        return new TokenEventHandler(applicationProperties);
    }
}
