package com.gonza.chatbot.service;

import com.gonza.chatbot.model.OrderInfo;
import com.gonza.chatbot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderManagementService {
    private OrderRepository orderRepository;

    public OrderManagementService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Long createOrder(OrderInfo orderInfo) {
        return orderRepository.save(orderInfo).getOrderID();
    }

    public Optional<List<OrderInfo>> getAllUserOrders(String userID) {
        return orderRepository.findByUserID(userID);
    }
}