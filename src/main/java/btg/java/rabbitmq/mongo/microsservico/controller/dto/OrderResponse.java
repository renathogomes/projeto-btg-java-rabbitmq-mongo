package btg.java.rabbitmq.mongo.microsservico.controller.dto;

import btg.java.rabbitmq.mongo.microsservico.entity.OrderEntity;
import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

  public static OrderResponse fromEntity(OrderEntity entity) {
    return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
  }

}
