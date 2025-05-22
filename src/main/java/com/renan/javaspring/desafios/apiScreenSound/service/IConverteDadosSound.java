package com.renan.javaspring.desafios.apiScreenSound.service;

public interface IConverteDadosSound {
    <T> T obterDadosSound(String json, Class<T> classe);
}
