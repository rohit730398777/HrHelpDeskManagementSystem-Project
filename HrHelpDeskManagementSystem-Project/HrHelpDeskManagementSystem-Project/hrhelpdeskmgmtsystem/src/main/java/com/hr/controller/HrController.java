package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.entity.Interview;
import com.hr.exception.GlobalExceptionForHr;
import com.hr.service.InterviewService;

@RestController
@RequestMapping("/hr")
public class HrController {
	
	
	//Constructor Injection
	@Autowired
	private InterviewService interviewService;
	
	
	//prints a welcome message
	@GetMapping("/welcome")
	public String description() {
		return interviewService.welcome();
	}
	
	
	//schedules a new interview 
	@PostMapping("/interview")
	public ResponseEntity<Interview> createInterview(@RequestBody Interview interview)throws GlobalExceptionForHr {
		 {
			 return interviewService.createInterview(interview);
		 }
	}
	
	
	//Update a Interview 
	@PutMapping("/interview/{id}")
	public ResponseEntity<Interview> updateInterview(@PathVariable("id") int id,@RequestBody Interview interview)throws GlobalExceptionForHr {
		 {
			 return interviewService.updateInterview(id, interview);
		 }
	}
	
	
	//Returns All Interview
	@GetMapping("/interviews")
	public List<Interview> getAllInterview() {
		return interviewService.getAllInterview();

	}
	
	
	//Returns all interview by date
	@GetMapping("/interviews/{date}")
	public ResponseEntity<List<Interview>> getAllInterviewsByDate(@PathVariable("date")String date) throws GlobalExceptionForHr{
		{
			return interviewService.getAllInterviewsByDate(date);
		}
	}
	
	
	//deletes an interview
	@DeleteMapping("/interview/{id}")
	public ResponseEntity<Interview> deleteInterview(@PathVariable int id) {
		
		return interviewService.deleteInterview(id);
	}
}
