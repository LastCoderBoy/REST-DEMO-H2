-- Users
INSERT INTO users (name, email, address) VALUES ('John Doe', 'john.doe@example.com', '123 Main St, Warsaw');
INSERT INTO users (name, email, address) VALUES ('Jane Smith', 'jane.smith@example.com', '456 Oak Ave, Krakow');
INSERT INTO users (name, email, address) VALUES ('Robert Johnson', 'robert.j@example.com', '789 Pine Rd, Gdansk');
INSERT INTO users (name, email, address) VALUES ('Maria Garcia', 'maria.g@example.com', '321 Elm Blvd, Poznan');
INSERT INTO users (name, email, address) VALUES ('Thomas Brown', 'thomas.b@example.com', '654 Maple Ln, Wroclaw');
INSERT INTO users (name, email, address) VALUES ('Anna Kowalska', 'anna.k@example.com', '987 Cedar Dr, Lodz');
INSERT INTO users (name, email, address) VALUES ('Peter Nowak', 'peter.n@example.com', '135 Birch St, Katowice');
INSERT INTO users (name, email, address) VALUES ('Lucia Lewandowska', 'lucia.l@example.com', '246 Spruce Ave, Szczecin');
INSERT INTO users (name, email, address) VALUES ('Michal Wisniewski', 'michal.w@example.com', '369 Willow Ct, Lublin');
INSERT INTO users (name, email, address) VALUES ('Katarzyna Dabrowska', 'katarzyna.d@example.com', '753 Aspen Way, Bydgoszcz');

-- Payment Methods
INSERT INTO payment_methods (name, description) VALUES ('Credit Card', 'Visa or Mastercard credit card payment');
INSERT INTO payment_methods (name, description) VALUES ('PayPal', 'Online payment via PayPal account');
INSERT INTO payment_methods (name, description) VALUES ('Bank Transfer', 'Direct bank transfer payment');
INSERT INTO payment_methods (name, description) VALUES ('Debit Card', 'Visa or Mastercard debit card payment');
INSERT INTO payment_methods (name, description) VALUES ('Apple Pay', 'Mobile payment via Apple Pay');
INSERT INTO payment_methods (name, description) VALUES ('Google Pay', 'Mobile payment via Google Pay');
INSERT INTO payment_methods (name, description) VALUES ('Cash', 'In-person cash payment');
INSERT INTO payment_methods (name, description) VALUES ('Bitcoin', 'Cryptocurrency payment via Bitcoin');
INSERT INTO payment_methods (name, description) VALUES ('Stripe', 'Online payment via Stripe gateway');
INSERT INTO payment_methods (name, description) VALUES ('Sofort', 'Online payment via Sofort banking');

-- Payments
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (150.00, '2025-01-15 10:30:00', 1, 1, 'COMPLETED', 'Payment for order #1001');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (200.50, '2025-01-16 11:45:00', 2, 2, 'PENDING', 'Payment for order #1002');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (75.25, '2025-01-17 09:20:00', 3, 3, 'FAILED', 'Payment for order #1003 - Insufficient funds');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (300.00, '2025-01-18 14:10:00', 4, 4, 'COMPLETED', 'Payment for order #1004');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (50.75, '2025-01-19 16:30:00', 5, 5, 'REFUNDED', 'Payment for order #1005 - Customer requested refund');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (120.00, '2025-01-20 12:15:00', 6, 6, 'COMPLETED', 'Payment for order #1006');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (99.99, '2025-01-21 13:50:00', 7, 7, 'PENDING', 'Payment for order #1007');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (250.00, '2025-01-22 15:25:00', 8, 8, 'COMPLETED', 'Payment for order #1008');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (175.50, '2025-01-23 10:00:00', 9, 9, 'FAILED', 'Payment for order #1009 - Technical issue');
INSERT INTO payments (amount, payment_date, user_id, payment_method_id, payment_status, description) VALUES (80.25, '2025-01-24 17:40:00', 10, 10, 'COMPLETED', 'Payment for order #1010');
