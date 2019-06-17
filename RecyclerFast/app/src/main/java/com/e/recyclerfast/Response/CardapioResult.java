package com.e.recyclerfast.Response;

import com.e.recyclerfast.Response.CardapioResponse;
import com.squareup.moshi.Json;

import java.util.List;

public class CardapioResult {


    @Json(name = "android")
    private final List<CardapioResponse> ResultadoCardapio;

    public List<CardapioResponse> getResultadoCardapio() {
        return ResultadoCardapio;
    }


    public CardapioResult(List<CardapioResponse> resultadoCardapio) {
        ResultadoCardapio = resultadoCardapio;
    }


}
