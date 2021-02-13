package com.example.galleryapp.photos.data

import java.io.Serializable
import com.google.gson.annotations.SerializedName
import java.net.URL

data class PhotoModel(
    @SerializedName("total_results")
    val total_results: Int = 0,
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("per_page")
    val per_page: Int = 0,
    @SerializedName("photos")
    val photos: List<Photo>? = null,
    @SerializedName("next_page")
    val next_page: String? = null
) : Serializable

data class Photo(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("width")
    val width: Int = 0,
    @SerializedName("height")
    val height: Int = 0,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("src")
    val src: Src? = null


) : Serializable

data class Src(
    @SerializedName("original")
    val original: String? = null
) : Serializable

