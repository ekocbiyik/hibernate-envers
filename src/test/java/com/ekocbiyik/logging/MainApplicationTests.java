package com.ekocbiyik.logging;

import com.ekocbiyik.logging.entity.Customer;
import com.ekocbiyik.logging.repository.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MainApplicationTests {

    @Autowired
    private ICustomerRepository customerRepository;

    @Test
    void createCustomer() {
        Customer cust1 = Customer.builder()
                .fullname("Customer 1")
                .username("customer1")
                .password("customer1")
                .enabled(true)
                .build();

        Customer cust2 = Customer.builder()
                .fullname("Customer 2")
                .username("customer2")
                .password("customer2")
                .enabled(true)
                .build();

        customerRepository.saveAll(List.of(cust1, cust2));
    }

    @Test
    void updateCustomer() {

        Customer cust1 = customerRepository.findCustomerByUsername("customer1");
        cust1.setFullname("cust1 update" + System.currentTimeMillis());
        customerRepository.save(cust1);

    }

}
