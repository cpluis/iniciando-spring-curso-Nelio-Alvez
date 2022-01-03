package br.com.couserspring.minhacarteira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.couserspring.minhacarteira.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
