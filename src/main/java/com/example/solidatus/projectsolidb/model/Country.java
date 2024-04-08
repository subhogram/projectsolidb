package com.example.solidatus.projectsolidb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer country_id;

    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    private String lastUpdate;

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Country() {
    }

    public Country(Integer country_id, String country, String lastUpdate) {
        this.country_id = country_id;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Country [country_id=" + country_id + ", country=" + country + ", lastUpdate=" + lastUpdate + "]";
    }

}
