package com.btp.dbbootjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btp.dbbootjpa.entities.Address;
import com.btp.dbbootjpa.service.AddressService;

@RestController
public class AddressController {
    
    @Autowired
    AddressService addressSrv;

    @RequestMapping("/addresses")
    public List<Address> getAddresses(){
        return addressSrv.getAddresses();
    }

    @PostMapping("/createAddress")
    public Address createAddree(@RequestBody Address myAddress){
        return addressSrv.createAddress(myAddress);
    }

    @RequestMapping("/address/{addressId}")
    public Optional<Address> getAddressById(@PathVariable("addressId") String id){
        return addressSrv.getSingleAddress(id);
    }


}
