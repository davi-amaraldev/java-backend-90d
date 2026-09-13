# Challenge Rules

These rules exist to keep the challenge focused on learning and engineering rather than maintaining a superficial streak.

## 1. Ninety days means ninety consecutive challenge days

The challenge runs for 90 calendar days.

Not every day must have the same workload.

Every seventh day may be used for a lighter checkpoint, review, debugging session, refactor or recovery session.

Missing one day does **not** restart the challenge.

A missed day must be recorded honestly and its essential learning objective must be recovered later.

## 2. A video is not a deliverable

Watching a course, reading a chapter or browsing documentation does not complete a day.

A completed day must create evidence of learning.

Examples:

- code;
- tests;
- a bug diagnosis;
- a refactor;
- SQL;
- an API design;
- a written technical explanation;
- a checkpoint result.

## 3. Understand before abstracting

No abstraction is introduced only because it appears in a tutorial.

Before creating an interface, service, repository, factory, adapter or other abstraction, there must be a problem it solves.

The question is always:

> What becomes easier to change, test, understand or protect because this exists?

## 4. Architecture follows pressure

The project begins simple.

Architecture evolves when real pressure appears:

- duplicated logic;
- difficult testing;
- mixed responsibilities;
- persistence concerns leaking into domain logic;
- transaction boundaries;
- authorization rules;
- integration with external systems.

Patterns are tools, not goals.

## 5. Prefer composition over accidental inheritance

Inheritance is used only when the subtype relationship is meaningful.

Code reuse alone is not sufficient justification.

## 6. No blind AI copy-paste

AI may explain, review, challenge and assist.

Before accepting AI-generated code, I must be able to answer:

- What does this code do?
- Why is it here?
- What alternative could I use?
- What can fail?
- How would I test it?

If I cannot answer these questions, the solution must be studied before it is accepted.

## 7. Search documentation before memorizing APIs

The challenge does not reward remembering every Java or Spring method.

It rewards understanding concepts and knowing how to locate reliable documentation.

Priority:

1. official documentation;
2. books and trusted technical material;
3. community content;
4. AI summaries.

## 8. Tests begin early

Tests are not a final-stage feature.

When logic has behavior worth protecting, it should have an automated test when practical.

Not every trivial getter requires a test.

Business rules do.

## 9. SQL comes before ORM convenience

Before relying on JPA/Hibernate, I must understand:

- tables;
- primary and foreign keys;
- joins;
- constraints;
- indexes;
- transactions;
- basic query planning concepts.

JPA must not become a substitute for understanding the database.

## 10. HTTP comes before Spring annotations

Before relying on Spring MVC abstractions, I must understand:

- HTTP methods;
- status codes;
- headers;
- request/response bodies;
- resource modeling;
- idempotency;
- API errors.

Annotations describe a contract; they do not replace it.

## 11. No premature microservices

The project remains a modular monolith during this challenge.

Distributed systems introduce costs that are not justified by the learning goal.

Microservices may be discussed as an architectural exercise, but not adopted without a concrete reason.

## 12. Commits must represent real work

Commits should reflect the actual learning timeline.

Do not backdate commits to manufacture activity.

Prefer meaningful messages such as:

```text
study: explore object references
test: cover reservation capacity rule
feat: add reservation creation use case
refactor: separate payment policy
docs: record week 3 checkpoint
```

## 13. Every day starts with recall

Before opening notes, spend a few minutes answering:

- What did I learn yesterday?
- Can I reproduce the core idea?
- Where did I struggle?
- Where does it appear in the project?

This is intentionally uncomfortable.

That difficulty is part of learning.

## 14. Every week ends with a checkpoint

A checkpoint should mix subjects instead of announcing which concept is being tested.

Examples:

- choose the correct collection;
- identify an object-modeling problem;
- diagnose a broken transaction;
- refactor difficult-to-test code;
- design an HTTP endpoint;
- explain why a test belongs at a certain level.

## 15. Do not optimize for lines of code

Deleting unnecessary code can be progress.

Replacing a bad abstraction with a simpler design can be progress.

The challenge measures understanding, not code volume.

## 16. Refactoring is part of implementation

"Working" is not always "done."

When new knowledge reveals a weakness in previous code, revisiting old code is encouraged.

## 17. The main project is the integration point

Labs may be temporary.

The main project should increasingly demonstrate the concepts that matter in a real backend.

## 18. The project must remain runnable

Important milestones should leave the main branch in a working state.

Broken experiments belong in a branch or lab.

## 19. Explain engineering decisions

For meaningful choices, prefer documenting the reason.

Examples:

- why `Set` instead of `List`;
- why a unique database constraint exists;
- why a transaction boundary belongs in a specific layer;
- why an abstraction was introduced;
- why an endpoint returns a particular status.

## 20. Day 90 is not a presentation

The final review includes modification.

A new requirement or bug should be introduced and solved live.

The goal is to prove that the system is understood, not memorized.
