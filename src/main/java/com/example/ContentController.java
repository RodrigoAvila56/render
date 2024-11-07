package com.example;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

    @GetMapping("/home")
    public String home(){
        return "HOME";
    }

    @GetMapping("/admin/home")
    public String adminHome(){
        return "ADMIN_HONME";
    }

    @GetMapping("/user/home")
    public String userHome(){
        return "USER_HOME";
    }

}
