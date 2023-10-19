package com.webservice.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
