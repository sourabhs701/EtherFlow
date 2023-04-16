package com.christ.etherflow;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HttpController
{
    @RequestMapping("/home")
    public String home()
    {
        System.out.println("Hello");
        return "home.html";
    }
}
