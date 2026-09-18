# 📚 Library Management & Resource Allocation System

## 📌 Overview
The **Library Management & Resource Allocation System** is a modular Java application designed to manage both physical library collections and digital media assets. Built as part of the course evaluation, it replaces traditional loan tracking with automated waitlists, multi-threaded digital asset licensing, personalized recommendations, and a fine/credit tracking engine.

---

## ✨ Features
* 📖 **Physical & Digital Catalog Management**: Full CRUD capabilities for books, e-journals, and multi-format media.
* ⏳ **Dynamic Waitlist Priority Queue**: Orders book reservation queues using custom priority scoring based on user roles (Faculty vs. Student) and deadline urgency.
* 🔒 **Concurrent Digital Licensing**: Multi-threaded session lock manager enforcing real-time license availability caps for e-books and digital assets.
* 🎯 **Smart Recommendation Engine**: Matrix-based preference matching that recommends relevant resources based on historical borrowing patterns.
* 🪙 **Fine & Reward Credit System**: Dual-action rule engine calculating late fees while rewarding early returns with redeemable credit points.

---

## 🛠️ Technologies & Tools Used
* 💻 **Language**: Java (JDK 8 or higher)
* 🧩 **Core Concepts**: Object-Oriented Programming (Abstraction, Inheritance, Encapsulation, Polymorphism)
* 📊 **Data Structures**: Java Collections Framework (`ArrayList`, `PriorityQueue`, `HashMap`)
* ⚡ **Concurrency**: Multithreading and Java Synchronization methods
* 💾 **I/O & Persistence**: File I/O Streams / JDBC Database Connectivity

---

## 🚀 Steps to Install & Run the Project

### Prerequisites
* Java Development Kit (JDK 8 or higher installed)
* Command Line / Terminal access

### Steps
1. **Clone the Repository**:
   ```bash
   git clone [https://github.com/khusboo25bai11068/JAVA-VITYARTHI-PROJECT.git](https://github.com/khusboo25bai11068/JAVA-VITYARTHI-PROJECT.git)
   cd JAVA-VITYARTHI-PROJECT

2. **Compile the Java Source Files**:
   ```bash
   javac *.java

3. **Run the Application**:
   ``` bash
   java Main

## 🧪 Instructions for Testing

Run `Main.java` to execute automated test routines[cite: 5]:

* **Priority Queue Test**: Verifies Faculty requests automatically jump to the front of reservation queues over Student requests[cite: 5].
* **Concurrent Licensing Test**: Confirms digital checkouts beyond license limits return `false` safely without race conditions[cite: 5].
* **Exception Handling Test**: Triggers invalid checkouts to verify `LibraryException` catches errors cleanly without crashing[cite: 5].

## 🖼️ Screenshots

### Terminal Execution Output
![Terminal Execution Output](Screenshot%202026-09-18%20000520.png)
