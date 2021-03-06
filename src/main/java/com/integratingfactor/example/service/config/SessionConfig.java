package com.integratingfactor.example.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

import com.integratingfactor.example.service.session.GdsSessionRepository;

@EnableSpringHttpSession
@Configuration
public class SessionConfig {
    @Bean
    public GdsSessionRepository sessionRepository() {
        return new GdsSessionRepository();
    }

    /**
     * register Spring session with http container
     * 
     * @author gnulib
     *
     */
    public class Initializer extends AbstractHttpSessionApplicationInitializer {

    }
}
