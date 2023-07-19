package br.com.udemy.cursotesteunitario.services;

import br.com.udemy.cursotesteunitario.domain.Users;

public interface UserService {
    Users findById(Integer id);
}
