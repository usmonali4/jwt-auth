package com.levelUp.chatBox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ChatBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBoxApplication.class, args);
	}

}
