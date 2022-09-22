package com.example.thymeleafbasic.prensentation;

import com.example.thymeleafbasic.persistence.StaffRepository;
import com.example.thymeleafbasic.persistence.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public record TasksController(TaskRepository taskRepository, StaffRepository staffRepository) {

    @GetMapping( "allStaffs")
    public String getAllStaffs(Model model){
        model.addAttribute("staffs",staffRepository.findAll());
        return "staffs";
    }

    @GetMapping("tasks")
    public String getAllTasksFromStaff(@RequestParam(value = "id") String idFromStaff,Model model){
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(staffRepository.findById(idFromStaff).get());
        System.out.println(taskRepository.findAllByStaff_Id(idFromStaff));
        model.addAttribute("staff",staffRepository.findById(idFromStaff).get());
        model.addAttribute("tasks",taskRepository.findAllByStaff_Id(idFromStaff));
        return "tasks";
    }
}
