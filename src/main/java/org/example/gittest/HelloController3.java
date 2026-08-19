package org.example.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController3 {
    @RequestMapping("/hello3")
    public String hello3(){
        return "Hello Git World";
    }
}
