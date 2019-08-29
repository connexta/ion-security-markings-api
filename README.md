# Security Markings API

## Prerequisites
* Java 11

## Building
Run the following command to build the project:
```bash
./gradlew build
```

### Build Checks

#### OWASP
This project leverages OWASP to run dependency security checks.
The dependency security checks are automatically run with the build.

Run the following command to perform dependency security checks.
```bash
./gradlew dependencyCheckAnalyze --info
```
The report for each project can be found at build/reports/dependency-check-report.html.

#### Formatting
This project leverages Spotless to perform formatting and formatting checks.
The formatting checks are automatically tied into the build.

Run the following command to format the project:
```bash
./gradlew spotlessApply
```

Run the following command to perform formatting checks:
```bash
./gradlew spotlessCheck
```
