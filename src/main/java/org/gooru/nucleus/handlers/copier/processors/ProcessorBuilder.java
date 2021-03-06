package org.gooru.nucleus.handlers.copier.processors;

import io.vertx.core.eventbus.Message;

public class ProcessorBuilder {

    private final Message<Object> message;

    public ProcessorBuilder(Message<Object> message) {
        this.message = message;
    }

    public Processor build() {
        return new MessageProcessor(message);
    }
}
