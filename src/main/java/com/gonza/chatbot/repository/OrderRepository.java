package com.gonza.chatbot.repository;

import com.gonza.chatbot.model.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderInfo, Long> {

    OrderInfo save(OrderInfo orderInfo);
    Optional<List<OrderInfo>> findByUserID(String id);
}
