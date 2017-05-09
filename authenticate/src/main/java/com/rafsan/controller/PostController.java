package com.rafsan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping(value={"/","home"})
    public String index(){

        return "index";
    }

    @RequestMapping("/user/draft")
    public String draft(){

        return "draft";
    }

    @RequestMapping("/admin/add")
    public String add(){

        return "add";
    }
}
