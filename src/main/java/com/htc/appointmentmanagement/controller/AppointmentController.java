package com.htc.appointmentmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.appointmentmanagement.dao.AppointmentDao;
import com.htc.appointmentmanagement.entity.Appointment;

@RestController
@RequestMapping("/api")
public class AppointmentController {
	@Autowired
	AppointmentDao repo;
	
	
	
	@GetMapping("/appointments")
	  public List<Appointment> getAllPatientdetails() {
	   
	    List<Appointment> list = new ArrayList<>();
	    Iterable<Appointment> customers = repo.findAll();
	 
	    customers.forEach(list::add);
	    return list;
	  }
	 
	
	@GetMapping("/appointments/{doctorId}")
	Appointment getAppointmentbyId(@PathVariable Long doctorId)
	{
		Appointment appointment=null;
		appointment=repo.findById(doctorId).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return appointment;
		
	}
	
	
	
	
	@PostMapping("/patients")
	Appointment createPatientdetails(@RequestBody Appointment appointment)
	{
		return repo.save(appointment);
		
	}
	

}
