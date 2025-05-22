package com.renan.javaspring.desafios.apiTabelaFipe.service;

public interface IConverteDadosFipe {

    <T> T obterDadosFipe(String json, Class<T> tClass);
}
