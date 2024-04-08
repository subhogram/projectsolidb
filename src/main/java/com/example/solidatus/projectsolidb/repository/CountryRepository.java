package com.example.solidatus.projectsolidb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solidatus.projectsolidb.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
