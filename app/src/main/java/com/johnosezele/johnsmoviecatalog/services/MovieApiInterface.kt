package com.johnosezele.johnsmoviecatalog.services

import com.johnosezele.johnsmoviecatalog.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=25fb98f49e61f0b38d84d3441a0b20b9")
    fun getMovieList(): Call<MovieResponse>
}