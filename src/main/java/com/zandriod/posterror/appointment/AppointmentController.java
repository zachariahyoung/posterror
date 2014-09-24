package com.zandriod.posterror.appointment;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ControllerUtils;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AppointmentController {
	
	private final AppointmentRepository appointmentRepository;
	
	@RequestMapping(value = "/appointment")	
	public String get() {
		return "Hello Appointment";
	}

	@RequestMapping(value = "/appointment",  method = POST)	
	public  ResponseEntity<ResourceSupport>  post(@RequestBody Appointment appointment) {
		
		System.out.println(appointment);
		Appointment save = appointmentRepository.save(appointment);
		System.out.println(save);
        return ControllerUtils.toEmptyResponse(HttpStatus.CREATED, null);
		
	}

}
