package com.burakbayramin.bankaccount.dto;

import com.burakbayramin.bankaccount.model.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {
    public String id;

    public TransactionType transactionType = TransactionType.INITIAL;

    public BigDecimal amount;

    public LocalDateTime transactionDate;

    public TransactionDto(String id, LocalDateTime transactionDate, BigDecimal amount, LocalDateTime transactionDate1) {
    }
}
