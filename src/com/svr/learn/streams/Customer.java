package com.svr.learn.streams;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String customerName;
    private int age;
    private String emailId;

    public Customer(int id, String customerName, int age, String emailId) {
        this.id = id;
        this.customerName = customerName;
        this.age = age;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public static List<Customer> staticListOfCustomerData() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Arun", 18, "arun@gmail.com"));
        customers.add(new Customer(2, "Bala", 28, "bala@hotmail.com"));
        customers.add(new Customer(3, "Chandru", 34, "chandru@yahoo.com"));
        customers.add(new Customer(4, "Danush", 15, "dhanush@gmail.com"));
        customers.add(new Customer(5, "Elango", 8, "elango@hotmail.com"));

        return customers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", age=" + age +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
