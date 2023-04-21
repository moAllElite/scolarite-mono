package com.groupeisi.gestionscolaire.service.impl;

import com.groupeisi.gestionscolaire.model.User;
import com.groupeisi.gestionscolaire.repository.IUserRepository;
import com.groupeisi.gestionscolaire.service.interfaces.IUserService;
import jakarta.persistence.EntityNotFoundException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UserService implements IUserService {

    private final IUserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("No user was found with provided eamil"));
   }


}
