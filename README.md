# TheGamingRoom: Draw It or Lose It (Java Game Service)

## Project Summary

**The Gaming Room** is a client seeking to expand the reach of their mobile game, **Draw It or Lose It**, initially built for Android. Their goal was to design a scalable, responsive, browser-based version of the game accessible on **Windows, macOS, Linux, iOS, and Android**. The new version should support thousands of concurrent users and leverage **existing Java code**, making use of **software design patterns** to create a reusable, maintainable system architecture.

As the developer, I was tasked with creating the **backend logic** in Java, demonstrating core principles of **object-oriented programming** and patterns like **Singleton** and **Iterator**. The design emphasizes modularity, uniqueness constraints, and real-time extensibility.

---

## Project Structure

drawitlooseit/
├── Entity.java # Abstract base class with id and name
├── Game.java # Represents a game with one or more teams
├── GameService.java # Singleton that manages games and IDs
├── Player.java # Player entity
├── ProgramDriver.java # Entry point; tests game creation
├── SingletonTester.java # Validates singleton behavior
└── Team.java # Team that holds players

yaml
Copy
Edit

---

## Features

- Create and manage games, teams, and players
- Enforce uniqueness for names (case-insensitive)
- Automatically assign unique IDs
- Uses **Singleton Pattern** for central game service control
- Demonstrates basic **manual iteration logic**
- Demonstrates inheritance using a shared `Entity` superclass

---

## Sample Output

Loop to instantiate GameService and make sure we always have same instance
Loop: 1
Are both GameService instances the same? true
...
Game - ID: 1, Name: Yellow Battle Field, Teams: 1
Team - ID: 1, Name: Red Dragons Field, Players: 1
Player - ID: 1, Name: Peter

yaml
Copy
Edit

---

## How to Run

1. Clone or download the repository.
2. Compile the files using:
   ```bash
   javac drawitlooseit/*.java
Run the application:

bash
Copy
Edit
java drawitlooseit.ProgramDriver
🔍 Reflection & Documentation Answers
1. Who was the client, and what software did they want?
The Gaming Room was the client, and they wanted a modernized, web-based version of their Android game, Draw It or Lose It. They required a cross-platform solution capable of supporting thousands of users concurrently, reusing their existing Java business logic and implementing software design best practices like the Singleton and Iterator patterns.

2. What did you do particularly well in this documentation?
I clearly organized and documented both the code structure and the system design intent. The README outlines responsibilities of each class, patterns used, and how to execute the program, making the system easy to understand and extend. The reflection questions were answered with clarity and purpose, aligning them with the actual design and development process.

3. What was helpful about working through a design document?
Designing the documentation before development helped clarify the scope and responsibilities of each component. It acted as a roadmap, reducing guesswork and making the coding process more efficient. By identifying design patterns early, I was able to reuse logic effectively and ensure consistency in naming and structure across the application.

4. What would you revise and how?
If I could revise one part, I would enhance the Domain Model section with a UML diagram to visually map out the class relationships. This would improve clarity for other developers or stakeholders reviewing the system and strengthen the design justification for inheritance and modularity.

 5. How did you interpret user needs and implement them?
I focused on platform independence, modularity, and scalability, which were critical client needs. The user experience was considered through constraints like name uniqueness, simplified game management, and seamless expansion support (e.g., converting to REST or WebSocket-based architecture). Considering the user’s needs is vital—it ensures that the system is not only functional but also relevant, intuitive, and maintainable.

 6. How did you approach software design and what would you do in the future?
I followed a top-down design approach, first understanding the domain, identifying reusable elements (like Entity), and then structuring responsibilities around them using object-oriented principles. In the future, I would also incorporate UML modeling tools, TDD (Test-Driven Development), and Agile documentation tools (e.g., PlantUML, Jira) to further improve clarity and iterative refinement in the design process.

 Design Patterns Used
Singleton: Central GameService ensures one instance manages all game-related data.

Iterator (manual): Loops through lists to prevent duplicates and access items.

Inheritance: Entity base class allows shared attributes across Game, Team, and Player.

Future Enhancements
Convert backend to REST API using Spring Boot

Add persistence using MySQL or PostgreSQL

Implement WebSocket-based multiplayer support

Build a responsive front-end using React or Vue

Add unit tests and logging

License
Developed for educational purposes as part of the CS-230 Software Design course at SNHU. All rights reserved.

Author
Stephen Nidri
CS-230 | Southern New Hampshire University


