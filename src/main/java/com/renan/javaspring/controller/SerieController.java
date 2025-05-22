package com.renan.javaspring.controller;

import com.renan.javaspring.model.Serie;
import com.renan.javaspring.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repository;

    @GetMapping("/series")
    public List<Serie> obterSeries() {
        return repository.findAll();
    }
}
