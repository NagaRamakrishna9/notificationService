package com.emailnotification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @GetMapping("/sendEmail/{name}")
    public String sendEmail(@PathVariable String name){
      //--> write  send email notification
        return "email sent successfull " + name;
    }
}
