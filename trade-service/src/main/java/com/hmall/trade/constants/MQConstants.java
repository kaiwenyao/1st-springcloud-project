package com.hmall.trade.constants;

public interface MQConstants {
    // 定义交换机名称
    String DELAY_EXCHANGE_NAME = "trade.delay.direct";
    // 队列名称
    String DELAY_ORDER_QUEUE_NAME = "trade.delay.order.queue";
    // routing key名称
    String DELAY_ORDER_KEY = "delay.order.query";

}
