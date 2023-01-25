package com.example.command.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * @author : nakgyeom
 * @date : 2023-01-25 오후 3:36
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountCommand {
    private String id;

    @TargetAggregateIdentifier
    private String holderId;
}
