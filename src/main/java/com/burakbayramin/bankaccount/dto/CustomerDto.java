package com.burakbayramin.bankaccount.dto;

import java.util.Set;

public class CustomerDto {
    public String id;

    public String name;

    public String surname;

    public Set<CustomerAccountDto> accounts;
}
