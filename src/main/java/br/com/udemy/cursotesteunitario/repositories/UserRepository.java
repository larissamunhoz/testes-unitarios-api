package br.com.udemy.cursotesteunitario.repositories;

import br.com.udemy.cursotesteunitario.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}
