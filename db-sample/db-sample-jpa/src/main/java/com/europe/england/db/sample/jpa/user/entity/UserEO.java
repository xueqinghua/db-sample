package com.europe.england.db.sample.jpa.user.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class UserEO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String country;
	private String city;
	private String profession;
	private String hobby;
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getHobby() {
		return hobby;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public String getProfession() {
		return profession;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

}
