package com.example.logonrm.fiapandroidretrofitrest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by logonrm on 19/06/2017.
 */

public interface ICarroAPI {

    @GET("/carros")
    Call<List<Carro>> listarTodos();

    @POST("/carros")
    Call<Void> salvar(@Body Carro carro);
}
