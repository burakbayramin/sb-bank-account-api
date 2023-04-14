package com.burakbayramin.bankaccount.repository;

import com.burakbayramin.bankaccount.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
