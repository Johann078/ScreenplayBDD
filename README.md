# PruebaSauceDemo Automation Project

This README provides step-by-step instructions for setting up and running the PruebaSauceDemo automation project.

## Prerequisites

- Java JDK 1.8 (Oracle OpenJDK version 1.8.0_202)
- Gradle 8.4
- IntelliJ IDEA (version used in the project)

## Setup Instructions

1. Clone the project repository to your local machine.

2. Open IntelliJ IDEA and import the project:
   - File > Open > Select the project directory

3. Configure Gradle:
   - Ensure Gradle is pointing to the correct installation:
     - File > Settings (or IntelliJ IDEA > Preferences on macOS)
     - Build, Execution, Deployment > Build Tools > Gradle
     - Use Gradle from: 'Local installation'
     - Gradle home: C:/gradle/gradle-8.4-bin/gradle-8.4

4. Set up the Java SDK:
   - File > Project Structure
   - Project Settings > Project
   - Set SDK to: 1.8 Oracle OpenJDK version 1.8.0_202

5. Sync the Gradle project:
   - Click the 'Sync' button in the Gradle tool window or
   - Right-click on the build.gradle file and select 'Sync'

## Running the Tests

1. Open the Gradle tool window (View > Tool Windows > Gradle)

2. Navigate to Tasks > verification > test

3. Double-click on 'test' to run all tests

Alternatively, you can run specific test classes:

1. Navigate to src/test/java/com/saucedemo/runners
2. Right-click on 'OnlineShoppingTestRunner'
3. Select 'Run OnlineShoppingTestRunner'

## Viewing Test Results

After running the tests:

1. Check the Run tool window for immediate results
2. For detailed reports, look in the build/reports/tests directory

If you encounter any issues, please check the project configuration and ensure all dependencies are correctly downloaded.
