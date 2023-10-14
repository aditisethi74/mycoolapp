package com.luv2code.springboot.demo.mycoolapp.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@RestController

public class FunRestController {
	
@Value("${hi}")	
 @GetMapping("/")
 public String sayhello() {
	 return ("HelloWorld!");
}
 @Value("${coach.name}")
 private String coachName;
 @Value("${team.name}")
 private String teamName;
 @GetMapping("/teaminfo")
 
 public String getTeaminfo() {
	 return "coach Name:"+coachName+",Team name:"+teamName;
 }
 
 
 
 
 }
 

