package com.bryanollivie.sdk.data.remote

import com.bryanollivie.sdk.data.remote.model.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "ylBdHecGCtUPMOEpzKIgox8cWr6u8kna",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>



}