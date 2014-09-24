package com.zandriod.posterror.appointment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
public class Product extends AbstractEntity {

	public Product() {}
	
    @Column(name = "PRD_MDL_NBR")
    private String model;

    @Column(name = "PRD_SPEC_DSC")
    private String description;


}
