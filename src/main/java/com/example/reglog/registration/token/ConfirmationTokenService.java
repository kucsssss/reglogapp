package com.example.reglog.registration.token;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepo confirmationTokenRepo;
            public void saveConfirmationToken(ConfirmationToken token) {
                confirmationTokenRepo.save(token);
            }
}
