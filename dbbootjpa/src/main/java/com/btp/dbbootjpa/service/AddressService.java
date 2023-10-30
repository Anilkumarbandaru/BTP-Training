package com.btp.dbbootjpa.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btp.dbbootjpa.entities.Address;

@Component
public class AddressService {
    @Autowired
    IAddressPersistance addressDB;

    public List <Address> getAddresses(){
        return addressDB.findAll();
    }

    public Optional<Address> getSingleAddress(String addressId){
        return addressDB.findById(addressId);
    }

    public Address createAddress (Address addressData){
        return addressDB.save(addressData);
    }

}
