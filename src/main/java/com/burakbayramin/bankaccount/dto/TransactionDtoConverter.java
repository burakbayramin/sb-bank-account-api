package com.burakbayramin.bankaccount.dto;

import com.burakbayramin.bankaccount.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from) {
        return new TransactionDto(from.getId(), from.getTransactionDate(), from.getAmount(), from.getTransactionDate());
    }
}
