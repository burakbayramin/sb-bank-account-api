package com.burakbayramin.bankaccount.repository;

import com.burakbayramin.bankaccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, String>{
}
