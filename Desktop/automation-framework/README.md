<<<<<<< HEAD
# automated-testing-framework
=======

# Automation Framework

>>>>>>> c67dcd6 (Initial commit with test 2)
## Overview
This is a modular automation framework for Web UI and API testing using open-source websites and APIs.

## Features
- **Web UI Testing**: Tests login functionality on [The Internet](https://the-internet.herokuapp.com/).
- **API Testing**: Tests RESTful API endpoints on [JSONPlaceholder](https://jsonplaceholder.typicode.com/).
- **Logging**: Uses Log4j for execution logs.
- **Reporting**: Extent Reports integration (can be extended).

## Getting Started
1. Clone this repository.
2. Update dependencies via Maven:
   ```bash
   mvn clean install
   ```
3. Run tests:
   ```bash
   mvn test
   ```

## Prerequisites
- **JDK 11+**
- **Maven**
- **WebDriver Executable** (e.g., `chromedriver` for Selenium tests).

## Structure
```
AutomationFramework/
├── src/
│   ├── main/
│   │   ├── resources/       # Configurations (e.g., log4j2.xml)
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/
│   │   │   │   ├── web/     # Selenium tests
│   │   │   │   ├── api/     # API tests
├── pom.xml                  # Maven dependencies
```

## License
This framework is open-source.
