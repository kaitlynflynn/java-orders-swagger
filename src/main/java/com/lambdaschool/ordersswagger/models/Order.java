package com.lambdaschool.ordersswagger.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordNum;

    private double ordAmount;
    private double advanceAmount;

    @Column(nullable = false)
    private long custCode;

    @Column(nullable = false)
    private long agentCode;

    private String ordDescription;

    public Order()
    {
        // default constructor
    }

    @ManyToOne
    @JoinColumn(name ="agentCode", nullable=false)
    @JsonIgnore
    private Agent agent;

    // getter for ordNum----------------------------------------------------------
    public long getOrdNum()
    {
        return ordNum;
    }

    // getters & setters------------------------------------------------------
    public double getOrdAmount()
    {
        return ordAmount;
    }

    public void setOrdAmount(double ordAmount)
    {
        this.ordAmount = ordAmount;
    }

    public double getAdvanceAmount()
    {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount)
    {
        this.advanceAmount = advanceAmount;
    }

    public long getCustCode()
    {
        return custCode;
    }

    public void setCustCode(long custCode)
    {
        this.custCode = custCode;
    }

    public long getAgentCode()
    {
        return agentCode;
    }

    public void setAgentCode(long agentCode)
    {
        this.agentCode = agentCode;
    }

    public String getOrdDescription()
    {
        return ordDescription;
    }

    public void setOrdDescription(String ordDescription)
    {
        this.ordDescription = ordDescription;
    }
}
