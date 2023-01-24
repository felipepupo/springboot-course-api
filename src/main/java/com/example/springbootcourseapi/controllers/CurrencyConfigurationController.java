package com.example.springbootcourseapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcourseapi.services.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {
    
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveCurrency() {
        return configuration;
    }
}
