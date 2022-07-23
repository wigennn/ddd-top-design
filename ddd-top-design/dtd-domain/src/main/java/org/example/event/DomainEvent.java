package org.example.event;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * @author wangweiqing
 * @version 2022/7/22
 */
public abstract class DomainEvent {
    /**
     * 领域事件id
     */
    protected final String eventId;
    /**
     * 发生时间
     */
    protected final String occurredOn;

    protected DomainEvent() {
        this.eventId = UUID.randomUUID().toString();
        this.occurredOn = new Timestamp(new Date().getTime()).toString();
    }
}
