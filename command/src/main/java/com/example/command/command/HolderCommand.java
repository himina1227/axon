package com.example.command.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

/**
 * @author : nakgyeom
 * @date : 2023-01-25 오후 3:37
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolderCommand {
    @TargetAggregateIdentifier
    private String id;

    private String accountId;

    private BigDecimal account;
}