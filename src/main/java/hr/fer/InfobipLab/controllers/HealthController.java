package hr.fer.InfobipLab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HealthController {


    @GetMapping
    public String getStatus() {
        return "OK";
    }
}
