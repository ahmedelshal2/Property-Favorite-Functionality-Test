### Step 1: Create a README.md File
Create a `README.md` file in the root directory of your project. This file will contain the description and instructions for your project.

### Step 2: Write the README Content
Here's a basic template for the `README.md` file:

```markdown
# Makyee Favorite Functionality Test

This project is an automated test script using Selenium WebDriver, Java, Page Object Model (POM), and TestNG to validate the favorite functionality on the Makyee website when a guest tries to favorite a property from the property details page. The script asserts the error the user receives.

## Project Structure

```
src/main/java/pages
├── pages
│   ├── HomePage.java
│   └── PropertyDetailsPage.java
└── tests
    └── FavoritePropertyTest.java
```

## Prerequisites

- Java Development Kit (JDK)
- Eclipse IDE
- Maven
- ChromeDriver

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/ahmedelshal2/Property-Favorite-Functionality-Test.git
   cd Property-Favorite-Functionality-Test
   ```

2. Open the project in Eclipse:
   - File -> Open Projects from File System -> Directory -> Select the project directory.

3. Add dependencies in `pom.xml`:

   ```xml
   <dependencies>
       <!-- Selenium Java dependency -->
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.1.0</version>
       </dependency>

       <!-- TestNG dependency -->
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.4.0</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
   ```

4. Set the path to ChromeDriver in `BaseTest.java`:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
   ```

## Running the Test

1. Run the test using TestNG:
   - Right-click on the `FavoritePropertyTest` class.
   - Select `Run As -> TestNG Test`.

## Notes

- Ensure the ChromeDriver path is correctly set.
- Adjust the locators in `HomePage` and `PropertyDetailsPage` classes to match the actual elements on the Makyee website.
- Modify the error message in the assertion to match the actual message displayed on the website.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

### Step 3: Commit and Push to GitHub
1. Save the `README.md` file.
2. Open a terminal and navigate to your project directory.
3. Run the following commands to commit and push the README to your GitHub repository:

```bash
git add README.md
git commit -m "Add README file"
git push origin main
```

Replace `main` with your branch name if it's different.

This README provides an overview of your project, setup instructions, and how to run the test. Customize it as needed for your specific project details.
