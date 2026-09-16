# Java Backend Engineering — 90 Days

A 90-day engineering challenge focused on becoming a stronger Java backend developer through deliberate practice, real software design decisions, testing, refactoring, databases, HTTP, Spring Boot, and architecture.

This is not a "learn Java syntax in 90 days" repository.

The goal is to become capable of receiving a backend requirement, modeling the problem, implementing it, testing it, persisting data, exposing a clean HTTP API, and explaining the engineering decisions behind the solution.

## Goals

By the end of the challenge, I want to be able to:

- write idiomatic modern Java with confidence;
- model business rules instead of building anemic CRUD code;
- understand object references, equality, collections, generics, exceptions, lambdas and streams;
- write automated tests and design code that is testable;
- use Maven effectively;
- work with PostgreSQL using SQL and JDBC before relying on an ORM;
- understand HTTP and REST as contracts, not just Spring annotations;
- build production-style APIs with Spring Boot;
- use JPA/Hibernate while understanding what happens underneath;
- work with transactions, validation, authentication and authorization;
- structure a modular monolith with clear boundaries;
- use Docker, migrations, integration tests and CI;
- review and defend architectural decisions.

## Philosophy

The challenge follows a simple loop:

```text
understand
   ↓
inspect an example
   ↓
implement
   ↓
test
   ↓
apply to the main project
   ↓
review/refactor
   ↓
explain the decision
```

Watching a lesson or reading documentation does not count as completing a day by itself.

Put learning into practice through code, exercises, tests, projects and refactoring.

## 90-Day Structure

| Days | Phase | Main outcome |
|---:|---|---|
| 1–14 | Java Foundations | Think naturally in Java |
| 15–28 | Professional Java | Build maintainable and testable code |
| 29–40 | Data & JDBC | Understand persistence and transactions |
| 41–48 | HTTP & REST | Design clear web contracts |
| 49–65 | Spring Boot | Build APIs while understanding the framework |
| 66–75 | Persistence & Security | Complete the backend foundation |
| 76–89 | Engineering & Delivery | Architecture, integration, Docker and CI |
| 90 | Engineering Review | Defend and refactor the system |

See [ROADMAP.md](ROADMAP.md) for the detailed curriculum.

## Main Project

The challenge revolves around one evolving backend system rather than dozens of disposable CRUD projects.

Working domain:

**Event & Reservation Platform**

Core concepts will include:

- users;
- events;
- reservations;
- capacity;
- ticketing;
- cancellation;
- authorization;
- simulated payment;
- transactional consistency.

The project will start as plain Java and progressively gain persistence, HTTP, Spring Boot, security, infrastructure and production tooling.

The architecture is expected to evolve with the problem.

No architecture pattern is adopted only because it is fashionable.

## Repository Structure

```text
.
├── README.md
├── ROADMAP.md
├── RULES.md
├── RESOURCES.md
├── labs/
│   └── day01/
└── project/
```

### `labs/`

Small, focused experiments used to understand a concept.

Examples:

```text
labs/
├── day01/
│   └── src/BankApp.java
└── day02/
    └── src/
```

Use `labs/dayNN/` to identify the challenge day through its exercises. The example above shows Day 1 and the planned Day 2 layout. Create directories only when work begins; not every day needs a new lab.

Labs exist to learn a concept. They are not portfolio projects.

### `project/`

The main backend application.

Concepts learned in the labs should eventually be applied here when they make sense.

## Study Loop

Study a concept, solve exercises, apply it to the project, test or refactor, and commit meaningful changes.

Git records the history and evolution of the work. Make as many commits as needed on any day. No daily journal, manual date or study-time log, written reflection, or progress metrics are required.

## Definition of Done

A day is complete only when I can show at least one concrete result and explain what I learned.

Typical evidence:

- implementation;
- passing tests;
- fixed bug;
- refactor;
- SQL query;
- API contract;
- architectural decision implemented in code.

See [RULES.md](RULES.md) for the complete challenge rules.

## Technology Stack

The stack will be introduced progressively.

```text
Java 17 LTS
Maven
JUnit 5
Mockito
PostgreSQL
JDBC
Spring Boot
Spring MVC
Spring Data JPA
Hibernate
Spring Security
Flyway
Testcontainers
Docker / Docker Compose
GitHub Actions
```

Tools are introduced only when the project has a reason to need them.

## What This Challenge Deliberately Avoids

The goal is backend engineering, so the core curriculum does not spend significant time on:

- Swing / JavaFX;
- Android;
- JSP;
- RMI / JNDI / JMX;
- deep JVM bytecode internals;
- advanced GC tuning;
- JNI / FFM;
- full Domain-Driven Design;
- CQRS;
- Event Sourcing;
- reactive Spring/WebFlux;
- Kafka;
- Kubernetes;
- microservices.

These can be studied later when there is a concrete need.

## AI Policy

AI is allowed as a learning and review tool.

It may be used for:

- explanations;
- hints;
- code review;
- debugging assistance;
- comparing approaches;
- generating questions;
- documentation lookup;
- discussing architecture.

It must not replace the reasoning step.

If I cannot explain code that AI produced, that code does not count as learned.

See [RULES.md](RULES.md).

## Final Test

Day 90 ends with an engineering review.

I should be able to explain, defend and modify the system without relying on a tutorial, including questions such as:

- Why does this class exist?
- Why is this dependency pointing in this direction?
- Why is this an interface?
- Where does this transaction start and end?
- Why was this collection chosen?
- What happens when two requests compete for the same resource?
- Is this test unit, integration or end-to-end?
- What would fail if the database disappeared?
- Why is this a modular monolith instead of microservices?
- How would I safely add a new requirement?

The challenge is complete when the code is not only working, but understandable.

## License

This repository uses the MIT License so the challenge structure and example code can be reused by others.
