package com.renan.javaspring.desafios.apiScreenSound.modelSound;

import java.util.Optional;

public enum TipoArtista {
    SOLO,
    DUPLA,
    BANDA;

    public static Optional<TipoArtista> fromString(String valor) {
        if (valor == null) return Optional.empty();
        try {
            return Optional.of(TipoArtista.valueOf(valor.toUpperCase()));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
