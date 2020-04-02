package com.chcpc.mvcdemobasic.controller;

import com.chcpc.mvcdemobasic.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class DemoController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");//viewName
        return mv;
    }
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/controller/index";
    }
    @RequestMapping("/parameter")
    public void parameter(String name, int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        System.out.println(student);
    }
    @RequestMapping("/student")
    public void student(Student student){
        System.out.println(student);
    }
}
