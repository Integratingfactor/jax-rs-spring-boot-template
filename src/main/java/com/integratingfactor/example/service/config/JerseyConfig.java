package com.integratingfactor.example.service.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.integratingfactor.example.service.api.ping.ProtectedPingService;
import com.integratingfactor.example.service.api.ping.PublicPingService;

@Component
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(PublicPingService.class);
        register(ProtectedPingService.class);
    }

}