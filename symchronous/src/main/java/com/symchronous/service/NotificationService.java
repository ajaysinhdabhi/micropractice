package com.symchronous.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	@Async
	public void sendTextMessage(String mobile) {
		
		sleep(5);
		System.out.println("call third party to send text message "+Thread.currentThread().getName());
		System.out.println(10/0);
	}

	
	private void sleep(int args) {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
