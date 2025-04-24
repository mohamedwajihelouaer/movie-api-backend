package com.jyx.jwt.auth;

import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Singleton;

import java.util.Set;

@Singleton
public class JwtService {

    public String generateToken() {
        var roles = Set.of("ROLE_USER", "ROLE_ADMIN");
        return Jwt.issuer("movie-api").subject("movie-api")
                .groups(roles).expiresAt(
                        (System.currentTimeMillis() / 1000) + 1800
                ).sign();
    }
}
