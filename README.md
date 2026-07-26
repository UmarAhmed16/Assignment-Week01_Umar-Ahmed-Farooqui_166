# Assignment-Week01_Umar-Ahmed-Farooqui_166
# Week 1 OOP Lab Assignment

## Student Information

* Name: Umar Ahmed Farooqui
* Seat No: B25110006166
* Section: A
* Course: Object Oriented Programming (OOP)
* Department: Computer Science
* University: University of Karachi

## About this Repository

This repository contains my Week 1 OOP lab assignment.
The purpose of this lab was to understand the basic concepts of Object-Oriented Programming by creating classes, objects, attributes, methods, constructors, and UML diagrams.

The assignment contains two Java programs:

* Car Demo
* Calculator Demo

## Folder Structure

```
Week01
│
├── CarDemo
│   ├── Car.java
│   ├── Main.java
│   ├── Car_UML.pdf
│   └── SampleOutput.txt
│
└── CalculatorDemo
    ├── Calculator.java
    ├── Main.java
    ├── Calculator_UML.pdf
    └── SampleOutput.txt
```

## Task 1 - Car Demo

In this task, I created a `Car` class and added different attributes and methods to represent a real car.

### Attributes

* Brand
* Speed
* Engine Status
* Fuel Level
* Gear
* odometer

### Methods

* Start Engine
* Stop Engine
* Change Gear 
* Drive
* Move Fast
* Move Slow
* Move Left
* Move Right
* Turbo mode
* Refuel
* Display State

The `Main.java` file creates two different car objects to show that each object has its own state, independent of the other. It also demonstrates edge cases such as trying to accelerate with the engine off, driving with an empty fuel tank, and trying to shift into Reverse while still moving.

### Stack and Heap

`Main.java` includes comments explaining how `Car ferrari = new Car();` works: `ferrari` is a reference variable on the stack, while `new Car()` creates the actual object on the heap. This is shown directly in the code comments above the object creation lines.

## Task 2 - Calculator Demo

In this task, I created a Calculator class that performs different mathematical operations.

### Operations

* Addition
* Subtraction
* Multiplication
* Division
* Power
* Modulus
* Average
* Maximum

The calculator also handles division by zero and modulus by zero by throwing an exception instead of returning an incorrect result. `add()`, `average()`, `maximum()`, and `minimum()` use varargs so they can accept any number of values.

## UML Diagrams

UML class diagrams for both the Car and Calculator classes are included in this repository.

## Sample Output

Sample output files are included for both programs.

## What I Learned

After completing this lab, I learned about:

* Classes and Objects
* Attributes
* Methods
* Constructors
* Creating multiple objects
* Object state
* UML Class Diagrams
* Basic Java programming

## Software Used

* Java
* Visual Studio Code
* Git
* GitHub
* Draw.io

## Author

Umar Ahmed Farooqui
BS Computer Science
University of Karachi
