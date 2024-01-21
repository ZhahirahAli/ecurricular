package com.heroku.java.CONTROLLER.sidebar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class SideBarAdminController {

    @GetMapping("/dashboardAdmin")
    public String dashboardAdmin(@RequestParam(name = "success", required = false) Boolean success, HttpSession session) {
      String teacherUsername = (String) session.getAttribute("teacherUsername");
      return "teacher/dashboardAdmin";
  }

  @GetMapping("/profileAdmin")
  public String editProfileAdmin(HttpSession session) {
      String teacherUsername = (String) session.getAttribute("teacherUsername");
      return "teacher/profileTeacher/profileAdmin";
  }

}