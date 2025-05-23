package com.renan.javaspring.controller;

import com.renan.javaspring.dto.SerieDTO;
import com.renan.javaspring.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService service;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
        return service.obterTodasAsSeries();
    }
}
