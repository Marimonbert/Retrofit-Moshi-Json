package com.e.recyclerfast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.e.recyclerfast.conexao.ApiService;
import com.e.recyclerfast.Response.CardapioResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CardapioActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_prato);

        ApiService.getINSTANCE()
                .obterFilmesPopulares()
                .enqueue(new Callback<CardapioResult>() {
                    @Override
                    public void onResponse(Call<CardapioResult> call, Response<CardapioResult> response) {
                        if (response.isSuccessful()) {

                            RecyclerView.LayoutManager LinearLayoutManager = new LinearLayoutManager(CardapioActivity.this);
                            recyclerView.setLayoutManager(LinearLayoutManager);
                            recyclerView.setAdapter(new CardapioAdapter(response.body().getResultadoCardapio()));

                        }


                    }

                    @Override
                    public void onFailure(Call<CardapioResult> call, Throwable t) {

                    }
                });


    }
}