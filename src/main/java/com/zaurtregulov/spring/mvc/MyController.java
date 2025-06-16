package com.zaurtregulov.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "firstView";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-employee-details-view";
    }
    //    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(){
//        return "show-employee-details-view";
//    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model){
        String empName = request.getParameter("employeeName");
        empName = "Mr. "+empName;
        model.addAttribute("nameAttribute",empName);
        return "show-employee-details-view";
    }
}
