package com.btp.dbbootjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btp.dbbootjpa.entities.Vendor;
import com.btp.dbbootjpa.service.VendorService;

@RestController
public class VendorController {

    @Autowired
    private VendorService myVendorSrv;

    @RequestMapping("/vendors")
    public List<Vendor> getAll() {
        return myVendorSrv.getAllVendors();
    }

    @PostMapping("/createVendors")
    public Vendor creatVendor(@RequestBody Vendor myVendor) {
        return myVendorSrv.createVendor(myVendor);
    }

    @RequestMapping("/vendor/{vendorCode}")
    public Optional<Vendor> getVendorById(@PathVariable("vendorCode") String Code) {
        return myVendorSrv.readVendorById(Code);
    }

    @DeleteMapping("vendor/{vendorCode}")
    public String deleteVendorById(@PathVariable("vendorCode") String Code) {
        return myVendorSrv.deleteVendor(Code);
    }

    @PutMapping("vendor/updateVendor/{vendorCode}")
    public Vendor creatVendor(@PathVariable("vendorCode") String Code, @RequestBody Vendor myVendor) {
        return myVendorSrv.updateVendorById(Code, myVendor);
    }

    @RequestMapping("/vendor/company/{companyName}")
    public List<Vendor> getByCompanyName(@PathVariable("companyName") String Code) {
        return myVendorSrv.getByCompanyName(Code);
    }

    @RequestMapping("/vendor/email/{email}")
    public List<Vendor> getByEmailId(@PathVariable("email") String Code) {
        return myVendorSrv.getByEmailId(Code);
    }
}