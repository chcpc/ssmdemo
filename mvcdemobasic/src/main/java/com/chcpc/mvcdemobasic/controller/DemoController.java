package com.chcpc.mvcdemobasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @RequestMapping("/test")
    public ModelAndView test1(){
        System.out.println("访问成功");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");//viewName
        return mv;
    }
}
