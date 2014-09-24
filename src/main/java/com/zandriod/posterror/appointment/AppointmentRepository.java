package com.zandriod.posterror.appointment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface AppointmentRepository extends PagingAndSortingRepository<Appointment, Long> {

}
