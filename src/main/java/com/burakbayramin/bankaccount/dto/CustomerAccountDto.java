package com.burakbayramin.bankaccount.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class CustomerAccountDto {
    public String id;

    public BigDecimal balance;

    public LocalDateTime creationDate;

    public Set<TransactionDto> transactions;
}
