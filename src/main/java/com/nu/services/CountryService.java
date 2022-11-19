package com.nu.services;

import com.nu.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    List<Country> getCountryList();
}
