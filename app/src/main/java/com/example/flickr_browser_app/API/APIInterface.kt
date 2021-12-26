package com.example.flickr_browser_app.API

import com.example.flickr_browser_app.Model.PhotoCollection
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {

    companion object {
        const val apiKey = "6cefe3f2452eaf0d53baf61c1e3ee3a0"
    }

    @GET("rest/?method=flickr.photos.search&api_key=$apiKey&format=json&nojsoncallback=1")
    fun getPhotos(@Query("text") text: String): Call<PhotoCollection?>?


}