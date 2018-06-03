package io.github.sandornemeth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class.
 *
 * @author Sandor Nemeth <sandor.nemeth.1986@gmail.com>
 */
@SpringBootApplication
public class KeycloakSecurityDemoApp {

    /**
     * Main entry point.
     *
     * @param args CLI args
     */
    public static void main(final String... args) {
        SpringApplication.run(KeycloakSecurityDemoApp.class, args);
    }
}
