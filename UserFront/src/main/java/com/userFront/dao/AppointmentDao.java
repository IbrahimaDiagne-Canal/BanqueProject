package com.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.userFront.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

}
