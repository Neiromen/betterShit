package com.zaurtregulov.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "firstView";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee",new Employee());
        return "ask-employee-details-view";
    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        return "show-employee-details-view";
    }
}
