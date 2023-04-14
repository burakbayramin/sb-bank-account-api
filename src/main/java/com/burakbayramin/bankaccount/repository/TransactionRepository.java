package com.burakbayramin.bankaccount.repository;

import com.burakbayramin.bankaccount.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
