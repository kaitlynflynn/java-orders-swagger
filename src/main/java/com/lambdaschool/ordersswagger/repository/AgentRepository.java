package com.lambdaschool.ordersswagger.repository;

import com.lambdaschool.ordersswagger.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long>
{
//    public Customer findByName(String name);
}
