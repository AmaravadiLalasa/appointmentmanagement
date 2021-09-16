package com.htc.appointmentmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.appointmentmanagement.entity.Appointment;

public interface AppointmentDao extends JpaRepository<Appointment, Long> {

}
