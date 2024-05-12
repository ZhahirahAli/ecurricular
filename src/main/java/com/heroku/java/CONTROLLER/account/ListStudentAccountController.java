// package com.heroku.java.CONTROLLER.account;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.heroku.java.MODEL.student.StudentBean;

// import jakarta.servlet.http.HttpSession;

// import java.sql.*;
// import javax.sql.DataSource;
// import java.util.ArrayList;
// import java.util.Map;

// import java.util.List;

// @Controller
// public class ListStudentAccountController {
//     private final DataSource dataSource;

//     // @Autowired
//     // public ListStudentAccountController(DataSource dataSource) {
//     //     this.dataSource = dataSource;
//     // }

// //     @GetMapping("/ListAccountStudent")
// //     public String studentAccountList(Model model) {

// //         List<StudentBean> student = new ArrayList<StudentBean>();

// //         try (Connection connection = dataSource.getConnection()) {
// //             String sql = "SELECT * FROM student order by studentname";
// //             final var statement = connection.prepareStatement(sql);
// //             //statement.setString(1, "baker"); (syahir punya nih)
// //             final var resultSet = statement.executeQuery();
           

// //             while (resultSet.next()) {
// //                 String studentIC = resultSet.getString("studentIC");
// //                 String studentName = resultSet.getString("studentName");
// //                 String studentEmail = resultSet.getString("studentEmail");
// //                 String studentPhone = resultSet.getString("studentPhone");
// //                 String studentDOB = resultSet.getString("studentDOB");
// //                 String studentGender = resultSet.getString("studentGender");
// //                String studentClass = resultSet.getString("studentClass");
// //                String studentAddress = resultSet.getString("studentAddress");
// //                String studentPassword = resultSet.getString("studentPassword");
                
// //                 StudentBean s = new StudentBean();
// //                 s.setStudentIC(studentIC);
// //                 s.setStudentName(studentName);
// //                 s.setStudentEmail(studentEmail);
// //                 s.setStudentPhone(studentPhone);
// //                 s.setStudentDOB(studentDOB);
// //                 s.setStudentGender(studentGender);
// //                 s.setStudentClass(studentClass);  
// //                 s.setStudentAddress(studentAddress);
// //                 s.setStudentPassword(studentPassword);              

// //                 student.add(s);
// //                 model.addAttribute("student", student);
// //                 //model.addAttribute("isAdmin", staffsrole != null && staffsrole.equals("admin")); // Add isAdmin flag to the modelF (syahir punya gak)

// //             }

// //             connection.close();

// //         return "account/ListAccountStudent";
// //         } catch (SQLException e) {
// //             e.printStackTrace();
// //             // Handle the exception as desired (e.g., show an error message)
// //             return "error";
// //         }
        
// //     }

// //     @GetMapping("/viewStudentDetails")
// //     public String viewStudentDetails(@RequestParam("studentIC") String studentIC, HttpSession session, Model model) {
// //         String teacherUsername = (String) session.getAttribute("teacherUsername");
// //         System.out.println("IC Number : " + studentIC);
// //         try {
// //             Connection connection = dataSource.getConnection();
// //             String sql = "SELECT * FROM public.student where studentic=?";
// //             final var statement = connection.prepareStatement(sql);
// //             statement.setString(1, studentIC);
// //             final var resultSet = statement.executeQuery();
// //             if (resultSet.next()) {
// //                 String studentName = resultSet.getString("studentName");
// //                 String studentEmail = resultSet.getString("studentEmail");
// //                 String studentPhone = resultSet.getString("studentPhone");
// //                 String studentDOB = resultSet.getString("studentDOB");
// //                 String studentGender = resultSet.getString("studentGender");
// //                 String studentClass = resultSet.getString("studentClass");
// //                 String studentAddress = resultSet.getString("studentAddress");
// //                 String studentPassword = resultSet.getString("studentPassword");

// //                 StudentBean s = new StudentBean();

// //                 s.setStudentIC(studentIC);
// //                 s.setStudentName(studentName);
// //                 s.setStudentEmail(studentEmail);
// //                 s.setStudentPhone(studentPhone);
// //                 s.setStudentDOB(studentDOB);
// //                 s.setStudentGender(studentGender);
// //                 s.setStudentClass(studentClass);
// //                 s.setStudentAddress(studentAddress);
// //                 s.setStudentPassword(studentPassword);

// //                 model.addAttribute("s", s);

// //                 connection.close();
// //             }
// //         } catch (Exception e) {
// //             e.printStackTrace();
// //         }

// //         return "account/viewStudentDetails";
// //     }

// //     @GetMapping("/DeleteStudentAccount")
// //     public String DeleteStudentAccount(HttpSession session, Model model, @RequestParam("studentIC") String studentIC) {
// //         //String studentIC = (String) session.getAttribute("studentIC");
// //         String studentName = (String) session.getAttribute("studentName");
// //         String studentEmail = (String) session.getAttribute("studentEmail");
// //         String studentPhone = (String) session.getAttribute("studentPhone");
// //         String studentDOB = (String) session.getAttribute("studentDOB");
// //         String studentGender = (String) session.getAttribute("studentGender");
// //         String studentClass = (String) session.getAttribute("studentClass");
// //         String studentAddress = (String) session.getAttribute("studentAddress");
// //         String studentPassword = (String) session.getAttribute("studentPassword");

// //     try (Connection connection = dataSource.getConnection()) {
// //         // Delete student from the students account list
// //         final var DeleteStudentAccount = connection.prepareStatement("DELETE FROM public.student WHERE studentic = ?");
// //         DeleteStudentAccount.setString(1, studentIC);
// //         DeleteStudentAccount.executeUpdate();

// //         System.out.println("Student account successfully deleted");
// //     } catch (Exception e) {
// //         System.out.println("Failed to delete student from the student account list");
// //         e.printStackTrace();
// //     }
// //     return "redirect:/ListAccountStudent";
// // }


// // public String deleteStudentAccount(@RequestParam("studentIC") String studentIC) {
// //     String studentICToDelete = request.getParameter("studentICToDelete");
		
// // 		// Validate if teacherIDToDelete is not empty or null
// // 	    if (studentICToDelete != null && !studentICToDelete.isEmpty()) {
// // 	        // Perform deletion logic using teacherIDToDelete
// // 	        // Example: Assuming you have a DAO class for handling database operations
// // 	    	StudentDAO studentDAO = new StudentDAO();

// // 	        studentDAO.deleteStudent(studentICToDelete);

// // 	        // Redirect to the coordinator list page after deletion
// // 	        response.sendRedirect("ListAccountStudent");
// // 	    } else {
// // 	        // Handle invalid or missing teacherIDToDelete parameter
// // 	        response.getWriter().println("Invalid or missing studentICToDelete parameter.");
// // 	    }
// //         return "account/ListAccountStudent";
// // }
    


// }
