package com.e.recyclerfast.conexao;

import com.e.recyclerfast.Response.CardapioResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterConect {


    @GET("fastmeal/cardapio/json")
    Call<CardapioResult> obterFilmesPopulares();
}

