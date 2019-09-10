package br.com.meatapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meatapp.domain.Orders;

@Repository//para enteder que é da camada de repository
public interface OrderRepository  extends JpaRepository<Orders, Integer>{

}
