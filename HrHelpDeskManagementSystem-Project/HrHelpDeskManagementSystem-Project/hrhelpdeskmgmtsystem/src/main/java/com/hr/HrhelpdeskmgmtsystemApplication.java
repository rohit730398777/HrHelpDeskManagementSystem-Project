package com.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hr.entity.Interview;
import com.hr.repository.InterviewRepository;

@SpringBootApplication
public class HrhelpdeskmgmtsystemApplication implements CommandLineRunner{
	
	@Autowired
	private InterviewRepository interviewRepository;

	public static void main(String[] args) {
		SpringApplication.run(HrhelpdeskmgmtsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Interview i1 = Interview.builder().name("Rajesh").mobNo("8115264212").email("rajesh112@gmail.com").college("IGNOU").qualification("BCA").date("05-03-2023").build();
		Interview i2 = Interview.builder().name("Mahesh").mobNo("7782334458").email("mahesh155@gmail.com").college("AMITY").qualification("MCA").date("01-04-2023").build();
		Interview i3 = Interview.builder().name("Akshay").mobNo("7947524741").email("aksh191@gmail.com").college("BAMU").qualification("BSCIT").date("06-05-2023").build();
		Interview i4 = Interview.builder().name("Pritish").mobNo("9167615824").email("pritish119@gmail.com").college("Chandrabhan Sharma College").qualification("MCA").date("09-06-2023").build();
		
		interviewRepository.save(i1);
		interviewRepository.save(i2);
		interviewRepository.save(i3);
		interviewRepository.save(i4);
		
		
		System.out.println("-----------All Saved-----------------");
	}

}
