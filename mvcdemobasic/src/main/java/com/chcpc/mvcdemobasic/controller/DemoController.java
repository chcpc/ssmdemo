package com.chcpc.mvcdemobasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class DemoController {
    @RequestMapping("/index")
    public ModelAndView index(){
        System.out.println("访问成功");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");//viewName
        return mv;
    }
    @RequestMapping("/redirect")
    public ModelAndView redirect(){
        System.out.println("访问成功");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/controller/index");//viewName
        return mv;
    }
}
