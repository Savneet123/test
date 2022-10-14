package com.app.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


	@Getter
	@Setter
	@ToString
	@NoArgsConstructor
	
	public class ResponseDto {
		private String prn;
		private String name;
		private String ccppid;
		
		private List<Integer> arr=new ArrayList<>();
		private List<String> str=new ArrayList<>();

	}




