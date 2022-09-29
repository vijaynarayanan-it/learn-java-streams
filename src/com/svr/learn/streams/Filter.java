package com.svr.learn.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Customer> customers = Customer.staticListOfCustomerData();

        // Getting Customer DTO with Expected Age check
        gettingCustomersWhoAreAboveProvidedAge(customers, 18).forEach(System.out::println);

        // Getting Customer details who has hotMail
        System.out.println("\n printing who has hotmail ids \n");
        gettingCustomersWhoHasSpecifiedEmailAccount(customers).forEach(System.out::println);
    }

    /**
     *
     * @param customers
     * @param age
     * @return
     */
    private static List<Customer> gettingCustomersWhoAreAboveProvidedAge(List<Customer> customers, int age) {
        return customers.stream()
                .filter(c-> c.getAge() > age)
                .collect(Collectors.toList());
    }

    private static List<Customer> gettingCustomersWhoHasSpecifiedEmailAccount(List<Customer> customers) {
        return customers.stream()
                .filter(c-> c.getEmailId().matches("(.*)hotmail.com"))
                .collect(Collectors.toList());
    }
}
