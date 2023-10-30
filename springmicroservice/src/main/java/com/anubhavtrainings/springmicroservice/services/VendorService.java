package com.anubhavtrainings.springmicroservice.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhavtrainings.springmicroservice.entities.Vendor;

@Component
public class VendorService {
    // this is like a internal table in java - variable which can store multiple
    // VENDOR objects
    private HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();
    // scope CLASS instanceName - private Vendor objName
    @Autowired
    private Vendor ven1;
    @Autowired
    private Vendor ven2;
    @Autowired
    private Vendor ven3;

    private void fillVendors() {
        // append wa to itab - here wa is your vendor object
        vendors.put("1", ven1);
        vendors.put("2", ven2);
        vendors.put("3", ven3);
        ven1.setCode("Vend1");
        ven2.setCode("Vend2");
        ven1.setCode("Vend3");
    }

    public VendorService() {
        // fillVendors();
    }

    // Read all vendors - Return a internal table
    public HashMap<String, Vendor> getAllVendors() {
        fillVendors();
        return vendors;
    }

    // Read single vendor by KEY - READ TABLE itab WITH KEY
    public Vendor readVendorById(String vendorId) {
        fillVendors();
        return vendors.get(vendorId);
    }

    // Add new record to vendors - APPEND wa to ITAB
    public Vendor addVendor(Vendor newVendor) {
        fillVendors();
        vendors.put("4", newVendor);
        return newVendor;
    }

    public Vendor updateVendorById(String vendorId, Vendor vendorData) {
        fillVendors();
        vendors.put(vendorId, vendorData);
        return vendorData;
    }

    public void deleteVendor(String vendorId) {
        fillVendors();
        vendors.remove(vendorId);

    }

}
