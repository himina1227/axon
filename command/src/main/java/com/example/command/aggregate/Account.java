package com.example.command.aggregate;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.math.BigDecimal;

/**
 * @author : nakgyeom
 * @date : 2023-01-25 오후 4:09
 */
@Aggregate
public class Account {
    @AggregateIdentifier
    private String id;

    private String holderId;

    private BigDecimal balance;

    public Account() {
    }
}