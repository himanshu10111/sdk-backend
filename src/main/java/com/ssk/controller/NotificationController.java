package com.ssk.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @CrossOrigin(origins = "*") // Replace with the origin you want to allow
    @GetMapping("/push-notification")
    public String getPushNotification() {
        // Mock notification message
        return "You have a new notification!";
    }
}