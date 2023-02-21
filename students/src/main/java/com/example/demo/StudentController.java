package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/")
	public String homepage() {
		return "Welcome Students!";
	}
	@GetMapping("/list")
	public List<studentclass> getList(){
		List<studentclass> detailsList=new ArrayList<>();
		detailsList.add(new studentclass(1,"name1",1));
		detailsList.add(new studentclass(2,"name2",2));

		return detailsList;
	}
}
