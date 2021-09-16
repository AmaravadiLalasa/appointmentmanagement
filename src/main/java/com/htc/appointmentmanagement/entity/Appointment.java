package com.htc.appointmentmanagement.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="appointment")

public class Appointment {
@Id	
private Long doctorId;	
private Long appointmentId;
private LocalDate appointmentDate;
private Long paitentId;

public Appointment() {
	super();
	// TODO Auto-generated constructor stub
}
public Appointment(Long appointmentId, LocalDate appointmentDate, Long paitentId, Long doctorId) {
	super();
	this.appointmentId = appointmentId;
	this.appointmentDate = appointmentDate;
	this.paitentId = paitentId;
	this.doctorId = doctorId;
}
public Long getAppointmentId() {
	return appointmentId;
}
public void setAppointmentId(Long appointmentId) {
	this.appointmentId = appointmentId;
}
public LocalDate getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(LocalDate appointmentDate) {
	this.appointmentDate = appointmentDate;
}
public Long getPaitentId() {
	return paitentId;
}
public void setPaitentId(Long paitentId) {
	this.paitentId = paitentId;
}
public Long getDoctorId() {
	return doctorId;
}
public void setDoctorId(Long doctorId) {
	this.doctorId = doctorId;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((appointmentId == null) ? 0 : appointmentId.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Appointment other = (Appointment) obj;
	if (appointmentId == null) {
		if (other.appointmentId != null)
			return false;
	} else if (!appointmentId.equals(other.appointmentId))
		return false;
	return true;
}
@Override
public String toString() {
	return "Appointment [appointmentId=" + appointmentId + ", appointmentDate=" + appointmentDate + ", paitentId="
			+ paitentId + ", doctorId=" + doctorId + "]";
}


}
