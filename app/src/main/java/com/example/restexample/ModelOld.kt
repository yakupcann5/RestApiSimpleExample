//package com.example.restexample
//
//import com.google.gson.annotations.SerializedName
//
//data class Model(
//    @SerializedName("info") var info: Info? = Info(),
//    @SerializedName("results") var results: ArrayList<Results> = arrayListOf()
//)
//
//data class Info(
//    @SerializedName("count") var count: Int? = null,
//    @SerializedName("pages") var pages: Int? = null,
//    @SerializedName("next") var next: String? = null,
//    @SerializedName("prev") var prev: String? = null
//)
//
//data class Origin(
//    @SerializedName("name") var name: String? = null,
//    @SerializedName("url") var url: String? = null
//)
//
//data class Location(
//    @SerializedName("name") var name: String? = null,
//    @SerializedName("url") var url: String? = null
//
//)
//
//data class Results(
//    @SerializedName("id") var id: Int? = null,
//    @SerializedName("name") var name: String? = null,
//    @SerializedName("status") var status: String? = null,
//    @SerializedName("species") var species: String? = null,
//    @SerializedName("type") var type: String? = null,
//    @SerializedName("gender") var gender: String? = null,
//    @SerializedName("origin") var origin: Origin? = Origin(),
//    @SerializedName("location") var location: Location? = Location(),
//    @SerializedName("image") var image: String? = null,
//    @SerializedName("episode") var episode: ArrayList<String> = arrayListOf(),
//    @SerializedName("url") var url: String? = null,
//    @SerializedName("created") var created: String? = null
//)