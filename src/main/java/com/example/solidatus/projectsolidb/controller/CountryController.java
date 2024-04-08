package com.example.solidatus.projectsolidb.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solidatus.projectsolidb.model.Country;
import com.example.solidatus.projectsolidb.repository.CountryRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @SuppressWarnings("null")
    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        List<Country> countries = new ArrayList<Country>();
        try {
            countryRepository.findAll().forEach(countries::add);
            return new ResponseEntity<>(countries, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/country/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable("id") long id) {
        Optional<Country> countryData = countryRepository.findById(id);

        if (countryData.isPresent()) {
          return new ResponseEntity<>(countryData.get(), HttpStatus.OK);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

}
