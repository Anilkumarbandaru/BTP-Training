package com.btp.dbbootjpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.btp.dbbootjpa.entities.Vendor;

public interface IVendorPersistance extends JpaRepository<Vendor, String> {
    List<Vendor> getByCompanyName(String companyName);

    @Query(nativeQuery = true, value = "SELECT * From public.vendor WHERE EMAIL like %?1% ")
    List<Vendor> getByEmailId(String email);

}
