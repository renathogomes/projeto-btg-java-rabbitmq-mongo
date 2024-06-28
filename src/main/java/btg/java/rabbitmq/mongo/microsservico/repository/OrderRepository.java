package btg.java.rabbitmq.mongo.microsservico.repository;

import btg.java.rabbitmq.mongo.microsservico.controller.dto.OrderResponse;
import btg.java.rabbitmq.mongo.microsservico.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

  Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
