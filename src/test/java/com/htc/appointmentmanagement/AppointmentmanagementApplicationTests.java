package com.htc.appointmentmanagement;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.appointmentmanagement.dao.AppointmentDao;
import com.htc.appointmentmanagement.entity.Appointment;

@SpringBootTest
class AppointmentmanagementApplicationTests {


	@Autowired
	AppointmentDao repo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAppointment() {
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(1L);
		appointment.setAppointmentDate(LocalDate.now());
		appointment.setDoctorId(2L);
		appointment.setPaitentId(3L);
		
		repo.save(appointment);
		
		assertNotNull(repo.findById(1L).get());
	}

	private void assertNotNull(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

}