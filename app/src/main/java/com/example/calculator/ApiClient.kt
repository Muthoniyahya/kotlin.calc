package com.example.calculator

fun main(){
    ApiClient()
}

object ApiClient{
    var retrofit = Retrofit.Builder()
        .baseUrl("<http://13.244.243.129/calculator/add>")
        .baseUrl("<http://13.244.243.129/calculator/subtract>")
        .baseUrl("<http://13.244.243.129/calculator/multiply>")
        .baseUrl("<http://13.244.243.129/calculator/divide>")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun<T>buildApiClient(apiInterface: Class<T>): T{
        returnretrofit.create(apiInterface)
    }
}