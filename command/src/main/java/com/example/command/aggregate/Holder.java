package com.example.command.aggregate;

import com.example.command.command.HolderCommand;
import com.example.common.event.HolderEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

/**
 * @author : nakgyeom
 * @date : 2023-01-25 오후 4:10
 */
@Aggregate
public class Holder {
    @AggregateIdentifier
    private String id;

    private String name;

    private String tel;

    private String address;

}
