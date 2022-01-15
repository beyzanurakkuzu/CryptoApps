package com.beyzaakkuzu.cryptoapp.service

import com.beyzaakkuzu.cryptoapp.data.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {


    //get,post, update , delete
    //https://github.com/atilsamancioglu/
    // K21-JSONDataSet/blob/master/crypto.json
    @GET("K21-JSONDataSet/blob/master/crypto.json")
    fun getData(): Call<List<CryptoModel>>
}

