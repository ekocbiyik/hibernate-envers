package com.ekocbiyik.logging.repository;

import com.ekocbiyik.logging.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByUsername(String username);

}
