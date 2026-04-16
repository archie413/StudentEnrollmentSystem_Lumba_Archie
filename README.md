Student Enrollment System

A simple Java-based desktop application designed to help schools and administrators manage student records, courses, and the enrollment process efficiently.

Features:

* Student Management: Register new students, update their information, and view existing student profiles.
* Course Management: Create and update available courses or academic programs.
* Enrollment System: Seamlessly link registered students to specific courses to officially enroll them.
* Dashboard UI: A simple, intuitive Graphical User Interface (GUI) built with Java Swing for easy navigation.

Technologies Used:

* Programming Language: Java
* GUI Framework: Java Swing (UI designed using NetBeans .form files)
* Database: MySQL
* Database Connectivity: JDBC (Java Database Connectivity)
* Design Pattern: DAO (Data Access Object) Pattern for organized database interactions.

Project Structure:

Here is a quick overview of the key files in this repository:

* StudentEnrollmentSystem1.java - The main entry point to launch the application.
* Frames.java / Frames.form - The main dashboard and navigation menu.
* DBConnection.java - Utility class that establishes the connection to the local MySQL database.
* StudentWindow.java, CourseWindow.java, EnrollmentWindow.java - The UI views for each respective module (paired with their .form files for visual layout).
* Student.java - The model class representing a student entity.
* StudentDAO.java - The Data Access Object that handles SQL queries (Insert, Update, Select) for student records.
* Archie System.mwb - The MySQL Workbench file containing the database schema and tables.

Setup & Installation:

Prerequisites
* Java Development Kit (JDK) installed.
* An IDE that supports Java Swing .form files (Apache NetBeans is highly recommended).
* MySQL Server and MySQL Workbench installed.
* MySQL JDBC Connector driver.

Steps to Run:

1. Clone the repository:
   git clone [https://github.com/archie413/StudentEnrollmentSystem_Lumba_Archie.git](https://github.com/archie413/StudentEnrollmentSystem_Lumba_Archie.git)

2.  Database Setup:
      * Open MySQL Workbench and load the Archie System.mwb file.
      * Execute the schema to create the necessary database and tables (Students, Courses, Enrollments).

3.  Configure Database Connection:
      * Open DBConnection.java in your IDE.
      * Update the connection URL, username, and password variables to match your local MySQL server credentials.

4.  Add Dependencies:
      * Ensure the MySQL JDBC Driver (mysql-connector-java.jar) is added to your project's libraries/build path.

5.  Run the Application:
      * Compile and run StudentEnrollmentSystem1.java to launch the dashboard.
