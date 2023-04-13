package com.hr.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hr.entity.Interview;
import com.hr.exception.GlobalExceptionForHr;



@Component
public interface InterviewService {
	
	String welcome();
	
	//Creates an interview
	ResponseEntity<Interview> createInterview(Interview interview) throws GlobalExceptionForHr;
	
	//Updates an interview
	ResponseEntity<Interview> updateInterview(int id, Interview interview) throws GlobalExceptionForHr;
	
	//Fetchs all interviews of a particular date
	ResponseEntity<List<Interview>> getAllInterviewsByDate(String Date);
	
	//Deletes an interview
	ResponseEntity<Interview> deleteInterview(int id);
	
	//Returns complete list interviews
    List<Interview> getAllInterview();

}
