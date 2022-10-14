package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ArrayDto;
import com.app.dto.ResponseDto;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:3000")
public class Hello {




	// user signup to check if email exist.
	@GetMapping("/test")
	public ResponseEntity<?> test(@RequestBody ArrayDto array) {
		ResponseDto res=new ResponseDto();
		
		System.out.println("aya"+array);
		for(int i=0;i<array.getStr().size();i++) {
			try {
			int a=Integer.parseInt(array.getStr().get(i));
			res.getArr().add(a);
			
			}
			catch (Exception e) {
				// TODO: handle exception
				res.getStr().add(array.getStr().get(i));
			}
			
		}
		res.setPrn("220340120174");
		res.setCcppid("PD 0088");
		
	
		return new ResponseEntity<>(res, HttpStatus.OK);

	}

}

