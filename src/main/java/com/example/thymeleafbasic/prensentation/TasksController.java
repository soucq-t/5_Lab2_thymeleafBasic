package com.example.thymeleafbasic.prensentation;

import com.example.thymeleafbasic.persistence.StaffRepository;
import com.example.thymeleafbasic.persistence.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public record TasksController(TaskRepository taskRepository, StaffRepository staffRepository) {

    @GetMapping( "allStaffs")
    public String getAllStaffs(Model model){
        model.addAttribute("staffs",staffRepository.findAll());
        return "staffs";
    }
}
