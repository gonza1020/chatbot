DROP TABLE IF EXISTS USER_ORDER;

CREATE TABLE user_order (
    order_id BIGINT NOT NULL PRIMARY KEY,
    user_id VARCHAR(20) NOT NULL,
    quantity INT
);

INSERT INTO user_order (order_id, user_id, quantity) VALUES (1, 'Jenny', 2);
INSERT INTO user_order (order_id, user_id, quantity) VALUES (2, 'Mary', 5);
INSERT INTO user_order (order_id, user_id, quantity) VALUES (3, 'Alex', 1);
INSERT INTO user_order (order_id, user_id, quantity) VALUES (4, 'John', 3);
INSERT INTO user_order (order_id, user_id, quantity) VALUES (5, 'Sophia', 4);
