package com.example.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment extends BaseEntity{
	
	
	private Long userId;
	
	private Long timeId;
	
	private LocalDate date;
	
	

}
