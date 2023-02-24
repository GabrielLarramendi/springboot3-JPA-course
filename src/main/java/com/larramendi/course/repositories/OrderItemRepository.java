package com.larramendi.course.repositories;

import com.larramendi.course.entities.OrderItem;
import com.larramendi.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
