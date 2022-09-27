package springpractise.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/")
public class UserController {
    @GetMapping(value = "/")
    public String index(){
        return "index "+new Date();
    }
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/user")
    public String user(){
        return "Hello user";
    }

    @GetMapping(value = "/admin")
    public String admin(){
        return "admin";
    }
}
