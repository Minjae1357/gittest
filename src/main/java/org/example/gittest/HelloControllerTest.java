package org.example.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerTest {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
