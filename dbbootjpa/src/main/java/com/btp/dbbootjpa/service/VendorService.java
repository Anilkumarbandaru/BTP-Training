package com.btp.dbbootjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btp.dbbootjpa.entities.Vendor;

@Component
public class VendorService {

    @Autowired
    IVendorPersistance vendorDB;

    // Read all vendors - Return a internal table
    public List<Vendor> getAllVendors() {
        return vendorDB.findAll();
    }

    // Read single vendor by KEY - READ TABLE itab WITH KEY
    public Optional<Vendor> readVendorById(String vendorId) {
        return vendorDB.findById(vendorId);
    }

    // Add new record to vendors - APPEND wa to ITAB
    public Vendor createVendor(Vendor newVendor) {
        return vendorDB.save(newVendor);
    }

    public Vendor updateVendorById(String vendorId, Vendor vendorData) {
        Optional<Vendor> vendorFound = vendorDB.findById(vendorId);
        return vendorDB.save(vendorData);
    }

    public String deleteVendor(String vendorId) {
        vendorDB.deleteById(vendorId);
        return "Object was deleted";
    }

    public List<Vendor> getByCompanyName(String companyName) {
        return vendorDB.getByCompanyName(companyName);
    }

    public List<Vendor> getByEmailId(String email) {
        return vendorDB.getByEmailId(email);
    }

}
