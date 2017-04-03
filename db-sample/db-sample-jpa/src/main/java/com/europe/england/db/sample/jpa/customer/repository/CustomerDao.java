package com.europe.england.db.sample.jpa.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.europe.england.db.sample.jpa.customer.entity.CustomerEO;

public interface CustomerDao extends CrudRepository<CustomerEO, Long> {

}
