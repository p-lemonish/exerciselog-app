package s24.backend.exerciselog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewController {
    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }
}
