package com.simpledev.question.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class QuestionApi {

	@Value("${question1}")
	private String question1;

	@Value("${question2}")
	private String question2;

	@Value("${question3}")
	private String question3;

	@Value("${question4}")
	private String question4;

	@GetMapping("/getQuestion")
	public String getQuestion() {

		StringBuilder sb = new StringBuilder();
		sb.append(question1)
		.append("<br>")
		.append(question2)
		.append("<br>")
		.append(question3)
		.append("<br>")
		.append(question4)
		.append("<br>")
		.append("=========")
		.append("<br>");
		
		return sb.toString();
	}

}
