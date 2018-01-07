package com.qooeo.lampard.service;

import java.util.List;

import com.qooeo.lampard.domain.RandomCity;
import com.qooeo.lampard.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
