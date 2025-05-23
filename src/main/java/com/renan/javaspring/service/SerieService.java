package com.renan.javaspring.service;

import com.renan.javaspring.dto.SerieDTO;
import com.renan.javaspring.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public List<SerieDTO> obterTodasAsSeries() {
        return repository.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),
                        s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(),
                        s.getSinops()))
                .collect(Collectors.toList());
    }
}
