# 🎮 GameApp – Strategy Pattern Implementation

## 📌 Overview
This project demonstrates the use of the **Strategy Design Pattern** in a simple game application.  
Different game characters (Knight, Wizard, and Archer) have varying attack and defense behaviors, which are implemented using interchangeable strategy objects instead of conditional logic.

---

## 🧩 Problem Statement

Suppose we have three types of characters in a GameApp:

1. **Knight**
   - Attacks with a sword
   - Uses three defense strategies:
     - Shield
     - Dodge
     - Magic Barrier

2. **Wizard**
   - Casts spells
   - Uses Magic Barrier to defend

3. **Archer**
   - Shoots arrows
   - Uses Dodge to defend

### Required Strategy Types

**A. DefenseStrategy**
- Shield  
- Dodge  
- CreateMagic  

**B. AttackStrategy**
- CastSpell  
- ShootArrow  
- SwingSword  

The original implementation used multiple `if-else` statements inside the `Character` class to determine attack and defense behaviors. This approach makes the code hard to maintain and extend.

The task is to **refactor the code using the Strategy Design Pattern** and provide a clean object-oriented design with a UML diagram.

---

## 🎯 Solution Approach

The **Strategy Pattern** is used to encapsulate attack and defense behaviors into separate classes.  
Each character is composed of:
- One **AttackStrategy**
- One or more **DefenseStrategy** objects

This removes conditional logic and allows behaviors to be changed or extended without modifying existing classes.

---

## 🏗️ Design Structure

### Strategy Interfaces
- `AttackStrategy`
- `DefenseStrategy`

### Concrete Strategies
**Attack Strategies**
- `SwingSword`
- `CastSpell`
- `ShootArrow`

**Defense Strategies**
- `Shield`
- `Dodge`
- `CreateMagic`

### Characters
- `Knight`
- `Wizard`
- `Archer`

Each character assigns its own attack and defense strategies during initialization.

---

## 📐 UML Diagram 

