package br.com.udemy.cursoTesteUnitario.services;

import br.com.udemy.cursoTesteUnitario.domain.User;

public interface UserService {
    User findById(Integer id);
}
