# Day 01 — Java Fundamentals with BankApp

Date: 2026-09-14
Journal written: 2026-09-15, retrospectively after review.
JDK: 17
Time spent: 40 minutes.
Status: completed as an introductory exercise; manual verification results not recorded.

## What I studied
- Class structure, main, Scanner, methods, parameters, and return values.
- static fields and methods, conditionals, and do...while loops.
- Input validation and basic exception handling.

## What I built
- A plain Java console BankApp with an initial balance of 1,000, balance inquiry, deposits, withdrawals, and an exit option.
- Menu-level validation to reject non-positive amounts and withdrawals above the available balance.

## What I struggled with
- I did not record specific difficulties during the session.
- The review identified two topics to revisit: where validation belongs and how to handle invalid Scanner input.

## What I learned
- Methods separate operations and receive inputs through parameters. A do...while loop keeps the menu running until exit is selected.
- A static balance belongs to the class rather than to an individual account.
- After review: validation in the menu does not protect direct calls to deposit and withdraw.
- After review: catching IllegalArgumentException does not handle InputMismatchException from invalid numeric input.

## Things to improve
- Run the manual checks documented in the lab README and record the actual results.
- On Day 02, introduce BankAccount with instance state and validation inside its operations. Rejected operations must leave the balance unchanged.
- Revisit double for monetary values and reject non-finite amounts.

## Evidence
- [Source code](../../labs/day01/src/BankApp.java)
- [Implementation commit: 7038bdd](https://github.com/davi-amaraldev/java-backend-90d/commit/7038bdd9de1ccbef23325ccf91b46cfcecd799e4)
- The review was static. Manual execution results and automated tests have not been recorded.
