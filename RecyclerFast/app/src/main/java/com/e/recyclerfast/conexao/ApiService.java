package com.e.recyclerfast.conexao;

import com.e.recyclerfast.conexao.InterConect;
import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiService {


    private static InterConect INSTANCE;

    public static InterConect getINSTANCE() {
        if (INSTANCE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://3.19.60.179/")
                    .addConverterFactory(MoshiConverterFactory.create())

                    .build();


            INSTANCE = retrofit.create(InterConect.class);

        }

        return INSTANCE;
    }

}


