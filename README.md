# AutomationExercise

A Selenium-based automation framework using Java and TestNG, designed to test the web application functionality such as login and home page behavior. The framework follows the Page Object Model (POM) design pattern for better code maintainability and readability.

---

## 📁 Project Structure

```
src
├── main/java/com/example
├── test/java
│   ├── pages               # Page Object Model classes
│   │   ├── BasePage.java
│   │   ├── HomePage.java
│   │   └── LoginPage.java
│   ├── testcases           # Test classes
│   │   ├── TestHomePage.java
│   │   ├── TestLoginPage.java
│   │   └── WebTest.java
│   └── utilities           # Utility classes (e.g., driver setup, data providers)
│       ├── DataSet.java
│       └── DriverSetup.java
├── target                  # Compiled classes and test reports
└── pom.xml                 # Maven dependencies and configuration
```

---

## 🧰 Tech Stack

- **Language:** Java
- **Framework:** TestNG
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)

---

## 🚀 How to Run Tests

### 1. Clone the Repository

```bash
git clone https://github.com/touhid1/AutomationExercise.git
cd AutomationExercise
```

### 2. Build the Project

Make sure you have Java 17+ and Maven installed.

```bash
mvn clean install
```

### 3. Run the Tests

```bash
mvn test
```

---

## 🧪 Test Classes Overview

| Class                | Description                                 |
|---------------------|---------------------------------------------|
| `TestHomePage.java` | Verifies elements and actions on Home page  |
| `TestLoginPage.java`| Validates login scenarios                   |
| `WebTest.java`      | Combined test scenarios                     |

---

## ⚙️ Utilities

| File               | Purpose                                    |
|--------------------|--------------------------------------------|
| `DriverSetup.java` | Initializes WebDriver                      |
| `DataSet.java`     | Provides test data (optional / parameterized) |

---

## 📝 Notes

- Update browser drivers in `DriverSetup.java` as needed.
- Test data can be extended in `DataSet.java` using TestNG DataProviders.
- Customize the base URL or configurations as per your test environment.

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 🙌 Contributions

Feel free to fork the project and submit pull requests. Contributions are welcome!