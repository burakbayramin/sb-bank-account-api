package com.burakbayramin.bankaccount.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class AccountDto {
    public String id;

    public BigDecimal balance;

    public LocalDateTime creationDate;

    public AccountCustomerDto customer;

    public Set<TransactionDto> transactions;


    public AccountDto(String id, BigDecimal balance, LocalDateTime creationDate, AccountCustomerDto accountCustomerDto, Set<TransactionDto> collect) {
    }
}
