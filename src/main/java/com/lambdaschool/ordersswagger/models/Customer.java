package com.lambdaschool.ordersswagger.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "custcode")
    private long id;

    @Column(name = "custname")
    private String name;

    @Column(name = "custcity")
    private String city;

    @Column(name = "workingarea")
    private String workingArea;

    @Column(name = "custcountry")
    private String country;

    @Column(name = "grade")
    private String grade;

    @Column(name = "openingamt")
    private double openingAmt;

    @Column(name = "receiveamt")
    private double receiveAmt;

    @Column(name = "paymentamt")
    private double paymentAmt;

    @Column(name = "outstandingamt")
    private double outstandingAmt;

    @Column(name = "phone")
    private String phone;

    public Customer()
    {
        // default constructor
    }

    @ManyToOne
    @JoinColumn(name ="agentCode", nullable=false)
    @JsonIgnore
    private Agent agent;

    // getters & setters------------------------------------------------------
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getWorkingArea()
    {
        return workingArea;
    }

    public void setWorkingArea(String workingArea)
    {
        this.workingArea = workingArea;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public double getOpeningAmt()
    {
        return openingAmt;
    }

    public void setOpeningAmt(double openingAmt)
    {
        this.openingAmt = openingAmt;
    }

    public double getReceiveAmt()
    {
        return receiveAmt;
    }

    public void setReceiveAmt(double receiveAmt)
    {
        this.receiveAmt = receiveAmt;
    }

    public double getPaymentAmt()
    {
        return paymentAmt;
    }

    public void setPaymentAmt(double paymentAmt)
    {
        this.paymentAmt = paymentAmt;
    }

    public double getOutstandingAmt()
    {
        return outstandingAmt;
    }

    public void setOutstandingAmt(double outstandingAmt)
    {
        this.outstandingAmt = outstandingAmt;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}
