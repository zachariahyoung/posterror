package com.zandriod.posterror.appointment;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Appointment extends AbstractEntity {
	
	@Column(name = "TRAK_NBR")
	private String trackNumber;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CNSM_APT_VER_WRK_I", nullable = false)
	private Set<Product> products = new HashSet<Product>();
}
