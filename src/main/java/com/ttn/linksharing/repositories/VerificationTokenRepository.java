package com.ttn.linksharing.repositories;

import com.ttn.linksharing.entity.VerificationToken;
import org.springframework.data.repository.CrudRepository;

public interface VerificationTokenRepository extends CrudRepository<VerificationToken,Integer> {

    public VerificationToken findByToken(String token);
}
