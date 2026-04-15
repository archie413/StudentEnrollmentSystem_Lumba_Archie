/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentenrollmentsystem1;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class StudentDAO {
    
     public boolean addStudent(Student student) {
        String query = "INSERT INTO student (first_name, last_name, age, email) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getAge());
            stmt.setString(4, student.getEmail());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 2. VIEW: Fetch all student records
    public List<Student> getAllStudents() { // FIXED: Capitalized 'Student'
        List<Student> students = new ArrayList<>(); // FIXED: Capitalized 'Student'
        String query = "SELECT * FROM student"; // Database table is lowercase 'student', which is correct!
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Student student = new Student( // FIXED: Capitalized 'Student'
                        rs.getInt("student_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getString("email")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    // 3. UPDATE: Update student details
    public boolean updateStudent(Student student) {
        String query = "UPDATE student SET first_name=?, last_name=?, age=?, email=? WHERE student_id=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getAge());
            stmt.setString(4, student.getEmail());
            stmt.setInt(5, student.getStudentId());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 4. DELETE: Delete a student
    public boolean deleteStudent(int studentId) {
        String query = "DELETE FROM student WHERE student_id=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, studentId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}