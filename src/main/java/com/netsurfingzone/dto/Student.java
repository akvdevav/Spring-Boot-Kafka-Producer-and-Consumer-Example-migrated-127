package com.netsurfingzone.dto;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Student {
	private Long id;
	private String name;
	private String rollNumber;
}