package com.anubhavtrainings.springmicroservice.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anubhavtrainings.springmicroservice.entities.Vendor;
import com.anubhavtrainings.springmicroservice.services.VendorService;

@RestController
public class VendorController {

    @Autowired
    private VendorService myVendorSrv;

    @RequestMapping("/vendors")
    public HashMap<String, Vendor> getAll() {
        return myVendorSrv.getAllVendors();
    }

}
