# 🎓 Student Grade Manager — Java MVC Console App

A console-based Student Grade Manager built in Java, following the **MVC (Model-View-Controller)** architecture. This is the second project in my Java learning path, focused on **inheritance, abstract classes, enums, and polymorphism**.

---

## 🎯 What I Learned

- **Abstract classes** — defining a base structure that cannot be instantiated directly
- **Inheritance** — `RegularStudent` and `ErasmusStudent` extending `Student`
- **Polymorphism** — storing different student types in a single `List<Student>`
- **`instanceof` operator** — identifying object types at runtime
- **Method overriding** — each subclass implements `calculateGrade()` differently
- **Enums** — `StudentType` for safe and readable type selection
- **ArrayList** — dynamic collections for storing students and grades
- **MVC separation** — model, service, and UI layers with clear responsibilities
- **Dependency Injection** — passing `StudentService` into `StudentUI` via constructor

---

## 🏗️ Architecture

This project follows a **Layered MVC Architecture**:
```
src/
├── model/
│   ├── Student.java           # Abstract base class
│   ├── RegularStudent.java    # Evaluated by average of multiple grades
│   ├── ErasmusStudent.java    # Evaluated by a single pass/fail grade
│   └── StudentType.java       # Enum — REGULAR or ERASMUS
├── service/
│   └── StudentService.java    # Business logic
├── ui/
│   └── StudentUI.java         # User interface
└── Main.java                  # Entry point
```
---

## 🧬 Inheritance Structure
```
Student (abstract)
├── RegularStudent
│     └── calculateGrade() → average of List<Double> grades
└── ErasmusStudent
└── calculateGrade() → returns single grade (pass if ≥ 10)
```
---

## ⚙️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/Nokz22/myJavaGradeManager.git
```

2. Open the project in **IntelliJ IDEA**
3. Run `Main.java`

---

## 💡 Features

- Add a Regular or Erasmus student
- Add multiple grades to a Regular student
- List all students with their calculated grade
- Remove a student by ID
- Input validation with default case handling

---

## 🔑 Key Concepts Explained

**Abstract Class vs Regular Class**

A regular class can be instantiated directly. An abstract class cannot — it serves as a blueprint. `Student` is abstract because there is no such thing as a "generic student" — every student is either Regular or Erasmus.

**Polymorphism in practice**

```java
List<Student> students = new ArrayList<>();
students.add(new RegularStudent("João", 1, "CS"));
students.add(new ErasmusStudent("Maria", 2, "Law"));
```

Both types live in the same list because both **are** `Student`.

**`instanceof` operator**

```java
if (student instanceof RegularStudent r) {
    r.addGrade(grade);
}
```

Used to safely identify the real type of an object at runtime.

---

## 👨‍💻 Author

**Nokz22** — learning Java with a focus on clean architecture and professional development practices.
