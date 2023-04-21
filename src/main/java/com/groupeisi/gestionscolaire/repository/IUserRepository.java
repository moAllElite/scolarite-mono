package com.groupeisi.gestionscolaire.repository;

import com.groupeisi.gestionscolaire.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    Page<User> findByLastNameContains(String kw, Pageable pageable);

}
