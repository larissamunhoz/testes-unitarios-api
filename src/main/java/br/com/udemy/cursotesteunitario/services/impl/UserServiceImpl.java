package br.com.udemy.cursotesteunitario.services.impl;

import br.com.udemy.cursotesteunitario.domain.Users;
import br.com.udemy.cursotesteunitario.domain.dto.UserDTO;
import br.com.udemy.cursotesteunitario.repositories.UserRepository;
import br.com.udemy.cursotesteunitario.services.UserService;
import br.com.udemy.cursotesteunitario.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<Users> findAll() {
        return repository.findAll();
    }

    @Override
    public Users create(UserDTO obj) {
        return repository.save(mapper.map(obj, Users.class));
    }


}
