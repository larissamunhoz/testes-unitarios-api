package br.com.udemy.cursotesteunitario.services;

import br.com.udemy.cursotesteunitario.domain.Users;
import br.com.udemy.cursotesteunitario.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    Users findById(Integer id);

    List<Users> findAll();

    Users create(UserDTO obj);
    Users update(UserDTO obj);

    void delete(Integer id);
}
