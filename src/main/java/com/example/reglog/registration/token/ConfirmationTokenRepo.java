package com.example.reglog.registration.token;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConfirmationTokenRepo
        extends JpaRepository <ConfirmationToken, Long> {

    Optional<ConfirmationToken> findByToken(String token);

}
