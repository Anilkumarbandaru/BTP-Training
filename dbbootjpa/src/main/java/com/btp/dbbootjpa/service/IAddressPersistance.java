package com.btp.dbbootjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btp.dbbootjpa.entities.Address;

public interface IAddressPersistance extends JpaRepository<Address, String>{
    
}
