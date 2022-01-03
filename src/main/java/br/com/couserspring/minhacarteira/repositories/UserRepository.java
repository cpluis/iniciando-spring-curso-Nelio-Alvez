package br.com.couserspring.minhacarteira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.couserspring.minhacarteira.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
