package com.lambdaschool.ordersswagger.repository;

import com.lambdaschool.ordersswagger.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>
{
}
