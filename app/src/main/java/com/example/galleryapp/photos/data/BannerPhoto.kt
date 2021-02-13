package com.example.galleryapp.photos.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class BannerPhoto(
    @SerializedName("total_results")
    val total_results: Int = 0,
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("per_page")
    val per_page: Int = 0,
    @SerializedName("photos")
    val photos: List<Photos>? = null,
    @SerializedName("next_page")
    val next_page: String? = null
) : Serializable

data class Photos(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("width")
    val width: Int = 0,
    @SerializedName("height")
    val height: Int = 0,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("src")
    val src: Source? = null


) : Serializable

data class Source(
    @SerializedName("original")
    val original: String? = null
) : Serializable

