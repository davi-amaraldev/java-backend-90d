# 90-Day Roadmap

This roadmap is intentionally outcome-driven.

Exact topics can move by a day when a concept needs more practice. Understanding takes priority over keeping an artificial schedule.

---

## Phase 1 — Java Foundations
### Days 1–14

**Outcome:** reason confidently about Java objects and core language features.

Topics:

- Java execution model: JDK, JVM, compiler and bytecode;
- object references and primitive values;
- classes, constructors and encapsulation;
- invariants and behavior-oriented objects;
- inheritance and subtype relationships;
- polymorphism;
- interfaces;
- composition;
- enums;
- records;
- exceptions;
- equality and `hashCode`;
- collections;
- generics.

Expected work:

- focused labs;
- small domain models;
- first unit tests;
- beginning of the event/reservation domain.

Checkpoint:

Explain and implement a small object model without tutorial guidance.

---

## Phase 2 — Professional Java
### Days 15–28

**Outcome:** write Java that is maintainable, testable and idiomatic.

Topics:

- lambdas;
- functional interfaces;
- streams;
- `Optional`;
- `java.time`;
- immutability;
- input/output essentials;
- Maven;
- JUnit 5;
- Mockito;
- debugging;
- logging;
- dependency injection without Spring;
- refactoring;
- coupling and cohesion;
- complexity and structure choice;
- basic concurrency concepts.

Expected work:

- increasing test coverage of business rules;
- refactor code that is intentionally difficult to test;
- introduce interfaces only where substitution or isolation creates value.

Checkpoint:

Receive unfamiliar code, find design problems, test it and improve it.

---

## Phase 3 — Data & JDBC
### Days 29–40

**Outcome:** understand persistence before using an ORM.

Topics:

- relational modeling;
- PostgreSQL;
- DDL and DML;
- keys and constraints;
- joins and aggregation;
- indexes;
- transactions;
- isolation basics;
- JDBC;
- connection lifecycle;
- prepared statements;
- repository boundary;
- database migrations concept.

Expected work:

Persist the reservation project using PostgreSQL and JDBC.

Checkpoint:

Implement a transactional data operation and explain failure behavior.

---

## Phase 4 — HTTP & REST
### Days 41–48

**Outcome:** design web APIs as contracts.

Topics:

- HTTP request/response model;
- methods;
- status codes;
- headers;
- JSON;
- paths and query parameters;
- resource modeling;
- idempotency;
- pagination;
- validation errors;
- API error design.

Expected work:

Design the reservation API before implementing it with Spring.

Checkpoint:

Given a product requirement, propose a clean HTTP contract and defend it.

---

## Phase 5 — Spring Boot
### Days 49–65

**Outcome:** understand what Spring is doing instead of memorizing annotations.

Topics:

- IoC;
- application context;
- beans;
- dependency injection;
- Spring Boot;
- configuration;
- Spring MVC;
- controllers;
- validation;
- exception handling;
- DTOs;
- mapping;
- service/application layer;
- testing Spring applications.

Expected work:

Move the existing project behind a Spring Boot HTTP API.

Checkpoint:

Trace a request from HTTP entry to business logic and back.

---

## Phase 6 — Persistence & Security
### Days 66–75

**Outcome:** build the foundation of a production-style backend.

Topics:

- JPA;
- Hibernate;
- entity lifecycle;
- mappings;
- fetch behavior;
- N+1 queries;
- transaction boundaries;
- Spring Data;
- Flyway;
- authentication;
- authorization;
- Spring Security;
- password handling;
- ownership rules.

Expected work:

Complete reservation persistence, authentication and authorization.

Checkpoint:

Find and fix a persistence/security bug without being told which abstraction is responsible.

---

## Phase 7 — Engineering & Delivery
### Days 76–89

**Outcome:** turn the working backend into a maintainable system.

Topics:

- modular monolith;
- package-by-feature;
- module boundaries;
- dependency direction;
- application/domain/infrastructure separation where useful;
- integration tests;
- Testcontainers;
- Docker;
- Docker Compose;
- configuration and secrets;
- health checks;
- logging and observability fundamentals;
- GitHub Actions;
- technical documentation;
- API documentation;
- performance inspection;
- architecture review.

Expected work:

Prepare the backend so another developer can clone, run, test and understand it.

Checkpoint:

Architecture review and change request.

---

## Day 90 — Engineering Review

The final day is an oral and practical defense of the project.

Activities:

1. explain the architecture;
2. trace a request end-to-end;
3. explain key business invariants;
4. explain transaction boundaries;
5. explain test strategy;
6. inspect persistence behavior;
7. identify technical debt;
8. receive a new requirement;
9. implement or design the change;
10. refactor something discovered during the review.

The challenge ends with understanding, not with a badge.
