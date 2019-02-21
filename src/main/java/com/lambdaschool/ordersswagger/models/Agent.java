package com.lambdaschool.ordersswagger.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "agents")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agentCode;
    private String agentName;
    private String workingArea;
    private double commission;
    private String phone;
    private String country;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "customers")
    private Set<Customer> customers;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "orders")
    private Set<Order> orders;

    public Agent()
    {
        // default constructor
    }

    public long getAgentCode()
    {
        return agentCode;
    }

    // getters and setters------------------------------------------------------------
    public String getAgentName()
    {
        return agentName;
    }

    public void setAgentName(String agentName)
    {
        this.agentName = agentName;
    }

    public String getWorkingArea()
    {
        return workingArea;
    }

    public void setWorkingArea(String workingArea)
    {
        this.workingArea = workingArea;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
