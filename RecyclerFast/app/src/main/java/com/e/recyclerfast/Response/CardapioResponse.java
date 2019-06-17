package com.e.recyclerfast.Response;

import com.squareup.moshi.Json;

import java.util.List;

public class CardapioResponse {
    @Json(name = "nome")
    private String nome;


    @Json(name = "id")
    private String id;

    public CardapioResponse(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }



}

