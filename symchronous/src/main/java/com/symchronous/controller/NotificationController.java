package com.symchronous.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.symchronous.service.NotificationService;


@RestController
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@GetMapping("/send")
	public String sendMessage(String mobile) {
		notificationService.sendTextMessage(mobile);
		
		return "message send successfully " + Thread.currentThread().getName();
	}
}
