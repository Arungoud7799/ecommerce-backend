# 🛒 E-Commerce Backend (Spring Boot)

This project is a backend system for an E-Commerce platform built using Spring Boot.

## Features
- User Registration API
- Password Encryption using BCrypt
- RESTful API Architecture
- Layered Architecture (Controller → Service → Repository)

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- Lombok

## Project Structure

src/main/java/com/arun/ecommerce

controller
service
repository
entity
config
util

## API Endpoints

### Register User
POST /api/auth/register

Example Request:
{
"name": "Arun",
"email": "arun@gmail.com",
"password": "1234"
}

### Login
POST /api/auth/login

## Future Enhancements
- Product Module
- Cart System
- Order Management
- JWT Authentication