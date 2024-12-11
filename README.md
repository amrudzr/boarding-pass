# Boarding Pass Management System

### **Overview**
The **Boarding Pass Management System** is a Java-based terminal application designed to manage boarding passes efficiently. This system adheres to object-oriented programming (OOP) principles, ensuring modularity, scalability, and maintainability. It provides essential features for creating, managing, and searching boarding pass records, all while demonstrating clean architecture and optimized algorithms.

---

### **Features**
- **Add Boarding Pass**: Create a new boarding pass with passenger details and flight information.
- **Delete Boarding Pass**: Remove an existing boarding pass using its unique identifier.
- **View All Boarding Passes**: Display all stored boarding passes in a user-friendly format.
- **Search Boarding Pass**: Quickly retrieve a boarding pass using its unique identifier with high efficiency.
- **Terminal-based Interaction**: Easy-to-use, menu-driven interface.

---

### **Technologies Used**
- **Language**: Java
- **Core Concepts**: Object-Oriented Programming (OOP)
- **Data Structure**: HashMap for optimized data retrieval and management

---

### **Project Structure**
The project is organized into the following components for better modularity:
- **Model**: Represents the data structure for a boarding pass (e.g., `BoardingPass` class).
- **Service**: Contains business logic for managing boarding passes (e.g., `BoardingPassService` class).
- **Application**: The entry point (`App.java`) with a terminal-based menu for user interaction.

---

### **How to Run**
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/amrudzr/boarding-pass.git
   cd boarding-pass

2. **Compile the Code**:
   ```bash
   javac src/model/*.java src/service/*.java src/App.java -d out

3. **Run the Application**:
   ```bash
   java -cp out App

### **Contributing**
Contributions are welcome! Please feel free to fork the repository, submit pull requests, or open issues for suggestions and improvements.
