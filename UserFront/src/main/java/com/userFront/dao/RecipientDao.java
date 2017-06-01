package com.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.userFront.domain.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long> {

}
