package com.tamingthymeleaf.application.user;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UserRepository extends PagingAndSortingRepository<User, UserId>, UserRepositoryCustom {
  boolean existsByEmail(Email email);

  Optional<User> findByEmail(Email email);
}