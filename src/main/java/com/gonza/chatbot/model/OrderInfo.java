package com.gonza.chatbot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "user_order")
public class OrderInfo {
    @Id
    @Column(name = "order_id")
    private Long orderID;
    @Column(name = "user_id")
    private String userID;
    @Column(name = "quantity")
    private Integer orderQuantity;
}
