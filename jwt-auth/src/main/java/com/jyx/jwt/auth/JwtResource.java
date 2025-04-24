package com.jyx.jwt.auth;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/jwt")
@ApplicationScoped
public class JwtResource {

    private final JwtService service;

    public JwtResource(JwtService service) {
        this.service = service;
    }

    public Response getJwt() {
        return null;
    }
}
