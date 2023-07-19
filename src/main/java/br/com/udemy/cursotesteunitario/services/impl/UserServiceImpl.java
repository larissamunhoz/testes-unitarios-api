package br.com.udemy.cursotesteunitario.services.impl;

import br.com.udemy.cursotesteunitario.domain.Users;
import br.com.udemy.cursotesteunitario.repositories.UserRepository;
import br.com.udemy.cursotesteunitario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
