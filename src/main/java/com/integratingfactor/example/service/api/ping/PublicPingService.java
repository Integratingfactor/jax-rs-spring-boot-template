package com.integratingfactor.example.service.api.ping;

import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.integratingfactor.example.service.api.ping.model.Pong;
import com.integratingfactor.example.service.api.ping.resource.PublicPingResource;

@Component
@Path("public/ping")
public class PublicPingService implements PublicPingResource {

    private static final Pong pong;

    static {
        pong = new Pong();
        pong.setMessage("Hello World!");
    }

    @Override
    public GetPublicPingResponse getPublicPing() throws Exception {
        return GetPublicPingResponse.withJsonOK(pong);
    }
}
