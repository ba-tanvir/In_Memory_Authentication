package com.example.SpringSecurityBasics.Resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    //Welcome should be accessible by everybody, even not logged in
    @GetMapping("/")
    public String welcome(){
        return ("<h1>Spring Security Basics</h1>");
    }


    //Should be accessible by user and admin who are logged in
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User to Spring Security</h1>");
    }


    //Should be accessible by admin, who are logged in
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin to Spring Security</h1>");
    }
}
