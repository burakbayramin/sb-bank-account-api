package com.burakbayramin.bankaccount.dto;

import com.burakbayramin.bankaccount.model.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {
    private String id;

    private TransactionType transactionType = TransactionType.INITIAL;

    private BigDecimal amount;

    private LocalDateTime transactionDate;
}
