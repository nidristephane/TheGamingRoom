# TheGamingRoom
TheGamingRoom (Included UML Diagram)


# TheGamingRoom: Draw It or Lose It (Java Game Service)

## Overview

**TheGamingRoom** is a modular, object-oriented Java application designed to simulate the backend logic for a multiplayer game called **Draw It or Lose It**. The project models a simplified game system using common software design patterns like Singleton and Iterator, supporting the creation of games, teams, and players.

This version runs as a console application, showcasing how to manage entities and enforce uniqueness across game instances and teams.

---

## Project Structure

drawitlooseit/
├── Entity.java
├── Game.java
├── GameService.java
├── Player.java
├── ProgramDriver.java
├── SingletonTester.java
└── Team.java

yaml
Copy
Edit

---

## Features

- **Singleton Pattern**  
  Ensures a single `GameService` instance controls the creation and management of all game data.

- **Entity Inheritance**  
  Common properties (`id`, `name`) are inherited by `Game`, `Team`, and `Player`.

- **Unique Name Enforcement**  
  Prevents duplicate names for games, teams, and players using case-insensitive comparisons.

- **Encapsulation & Reusability**  
  Clean object-oriented design for easy extension and testing.

---

## How to Run

1. **Clone or Download** this repository.
2. Compile the Java files using your IDE (like IntelliJ or Eclipse) or command line:

```bash
javac drawitlooseit/*.java
Run the application:

bash
Copy
Edit
java drawitlooseit.ProgramDriver
Sample Output
yaml
Copy
Edit
Loop to instantiate GameService and make sure we always have same instance
Loop: 1
Are both GameService instances the same? true
...
Game - ID: 1, Name: Yellow Battle Field, Teams: 1
Team - ID: 1, Name: Red Dragons Field, Players: 1
Player - ID: 1, Name: Peter
🔨 Class Summary
GameService
Singleton service responsible for managing games.

Tracks unique IDs for games, teams, and players.

Prevents creation of duplicate games by name.

Game
Inherits from Entity.

Can hold multiple Team instances.

Prevents duplicate team names.

Team
Inherits from Entity.

Can hold multiple Player instances.

Prevents duplicate player names.

Player
Inherits from Entity.

Represents a player in a team.

Entity
Base class containing common id and name fields with getters.

SingletonTester
Tests whether multiple calls to GameService.getInstance() return the same object.

ProgramDriver
Entry point of the application.

Demonstrates game creation, team and player addition, and Singleton usage.

Design Patterns
Singleton: Ensures a single point of access for game logic and resource control.

Iterator (Manual): Loops through collections to check for duplicates and retrieve items.

Inheritance: Promotes DRY principles via Entity base class.

Future Enhancements
Integrate a GUI or web-based interface

Add networking for multiplayer capability

Store data persistently using a database

Enhance error handling and logging

Add unit tests using JUnit

License
This project was developed for academic purposes as part of the CS-230 Software Design course at SNHU. All rights reserved by the original author(s).

👤 Author
Stephen Nidri
CS-230 | Southern New Hampshire University
