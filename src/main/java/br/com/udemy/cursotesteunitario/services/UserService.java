package br.com.udemy.cursotesteunitario.services;

import br.com.udemy.cursotesteunitario.domain.Users;

import java.util.List;

public interface UserService {
    Users findById(Integer id);

    List<Users> findAll();
}
