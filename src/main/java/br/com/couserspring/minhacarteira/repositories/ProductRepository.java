package br.com.couserspring.minhacarteira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.couserspring.minhacarteira.entities.Category;
import br.com.couserspring.minhacarteira.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
