# REST API with H2 Database: Payments Demo

## **Project Overview**
This project is a **RESTful API** built with **Spring Boot**, **H2 in-memory database**, and sample data for **Payment, PaymentMethod, and User** entities. It is designed for **testing and learning** new features. The Developer can clone the repository and do their own work on the REST API project.

---

## **Features**
- **CRUD operations** for Payments, Payment Methods, and Users.
- **Sample data** preloaded in `data.sql` for quick testing.
- **H2 Console** for database inspection and queries.
- **MapStruct** for seamless DTO-Entity mapping.

---

## **Technologies Used**
- **Java 21** (LTS)
- **Spring Boot 3.x**
- **H2 Database** (in-memory)
- **MapStruct** (for DTO mapping)
- **Lombok** (for boilerplate code reduction)
- **SLF4J** (for logging)

---

## **Entities**
1. **User**: Represents users making payments.
2. **PaymentMethod**: Represents payment methods (e.g., Credit Card, PayPal).
3. **Payment**: Represents payment transactions, linked to `User` and `PaymentMethod`.

---

## **Setup and Run**
1. **Clone the repository**:
   ```bash
   git clone https://github.com/LastCoderBoy/REST-DEMO-H2.git
   cd REST-DEMO-H2
