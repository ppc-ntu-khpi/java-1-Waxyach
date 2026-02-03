package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer(1);
        customer.displayCustomerInfo();

        customer.setId(5);
        customer.setStatus(true);
        customer.setTotal(1250);

        customer.displayCustomerInfo();
    }
}
