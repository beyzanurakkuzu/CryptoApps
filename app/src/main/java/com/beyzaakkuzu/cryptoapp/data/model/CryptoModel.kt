package com.beyzaakkuzu.cryptoapp.data.model

import com.google.gson.annotations.SerializedName

class CryptoModel(
    @SerializedName("currency")
    val currency:String,
    @SerializedName("price")
    val price:String)
