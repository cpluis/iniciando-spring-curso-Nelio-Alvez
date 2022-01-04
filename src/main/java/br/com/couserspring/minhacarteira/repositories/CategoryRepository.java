package br.com.couserspring.minhacarteira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.couserspring.minhacarteira.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
