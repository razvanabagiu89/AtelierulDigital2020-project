# Car sales system in Java

## About

Final project for the Google courses on Java which showcases a real scenario of a Dealership in the automotive industry.

https://events.withgoogle.com/atelierul-digital-pentru-programatori/

## How to run
Run Main class.

## Implementation

The dealership has the following features:
- add or remove a car from its registry, where it keeps the record of every entity
- search a specific car in the registry
- test drive a car 
- expose all the cars to the client
- offer several discounts on the price due to negotiation
- have a mechanic to check the car for issues

### Design patterns

Following design patterns were used:
#### Factory

Used in the production of the cars by specifying one of the three types:
- Comfort 
- Muscle
- Sports

and another criteria for specifying the transmission: automatic or manual.
 
#### Observer

Each car is an observator for the Mechanic class which is an observable. Every time a client wants his car checked the Mechanic class is doing the checking and notifying the dealership if the car is broken or good to go by applying a certain flag and logging messages to the console.

#### Strategy

For negotiating the price, a client can choose two current strategies: having the classic weekly 10% discount or a random discount.

#### Singleton

This dealership has only one factory so it doesn't need more instances to cope with.

## Project structure
```bash
├── JavaGoogle.iml
├── out
│   └── production
│       └── JavaGoogle
│           ├── Dealership.class
│           ├── Factory
│           │   ├── Car.class
│           │   ├── CarFactory.class
│           │   ├── ComfortCar.class
│           │   ├── MuscleCar.class
│           │   └── SportsCar.class
│           ├── Main.class
│           ├── Observer
│           │   └── Mechanic.class
│           ├── README.md
│           └── Strategy
│               ├── Client.class
│               ├── Discount.class
│               ├── RandomDiscount.class
│               └── WeeklyDiscount.class
├── README.md
└── src
    ├── Dealership.java
    ├── Factory
    │   ├── CarFactory.java
    │   ├── Car.java
    │   ├── ComfortCar.java
    │   ├── MuscleCar.java
    │   └── SportsCar.java
    ├── Main.java
    ├── Observer
    │   └── Mechanic.java
    └── Strategy
        ├── Client.java
        ├── Discount.java
        ├── RandomDiscount.java
        └── WeeklyDiscount.java

```