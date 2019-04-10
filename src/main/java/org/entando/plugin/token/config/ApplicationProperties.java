package org.entando.plugin.token.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Properties specific to Entando Token Plugin.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@Configuration
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private int tokenExpirationInHours;

    public int getTokenExpirationInHours() {
        return tokenExpirationInHours;
    }

    public void setTokenExpirationInHours(int tokenExpirationInHours) {
        this.tokenExpirationInHours = tokenExpirationInHours;
    }
}
