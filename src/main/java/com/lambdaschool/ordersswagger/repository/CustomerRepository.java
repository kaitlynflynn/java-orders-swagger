package com.lambdaschool.ordersswagger.repository;

import com.lambdaschool.ordersswagger.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{

    Customer findByName(String name);
}
