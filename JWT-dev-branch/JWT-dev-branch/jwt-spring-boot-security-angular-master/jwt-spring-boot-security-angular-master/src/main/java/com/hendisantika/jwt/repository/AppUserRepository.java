package com.hendisantika.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hendisantika.jwt.domain.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);

}
