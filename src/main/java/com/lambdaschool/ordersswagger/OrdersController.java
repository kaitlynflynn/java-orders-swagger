package com.lambdaschool.ordersswagger;

import com.lambdaschool.ordersswagger.models.Agent;
import com.lambdaschool.ordersswagger.models.Customer;
import com.lambdaschool.ordersswagger.repository.AgentRepository;
import com.lambdaschool.ordersswagger.repository.CustomerRepository;
import com.lambdaschool.ordersswagger.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrdersController
{
    @Autowired
    AgentRepository agentRepo;

    @Autowired
    CustomerRepository custRepo;

    @Autowired
    OrderRepository orderRepo;

    // Returns customer by id
    @GetMapping("/customer/id/{id}")
    public Customer findCustId(@PathVariable long id)
    {
        var foundCust = custRepo.findById(id);
        if(foundCust.isPresent())
        {
            return foundCust.get();
        }
        else
        {
            return null;
        }
    }

    @GetMapping("/customer/order")
    public List<Customer> customerOrders()
    {
        return custRepo.findAll();
    }

    // Returns all order for a particular based on name
    //    @GetMapping("/customer/name/{custname}")


    // Returns all orders for a particular customer based on custcode
    //    @GetMapping("/customer/order/{custcode}")

    // Returns all agents with their customers
    @GetMapping("/agents")
    public List<Agent> allAgents()
    {
        return agentRepo.findAll();
    }


    // Return a list with the agents name and associated order number and order description
    //    ("/agents/order")

    // Deletes a customer based off of their custcode and deletes all their associated orders
    //    ("/customer/{custcode")

    // Deletes an agent if they are not assigned to a customer or order (STRETCH GOAL)
    //    ("/agents/{agentcode}")
}
