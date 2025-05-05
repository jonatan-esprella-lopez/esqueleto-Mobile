package com.example.esqueleto_mobile.server.models

import com.google.gson.annotations.SerializedName


data class RickAndMortyResponse(
    val info: Info,
    val results: List<Characters>
)

data class Info(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)


data class Characters(
    @SerializedName("id"       ) var id       : Int?              = null,
    @SerializedName("name"     ) var name     : String?           = null,
    @SerializedName("status"   ) var status   : String?           = null,
    @SerializedName("species"  ) var species  : String?           = null,
    @SerializedName("type"     ) var type     : String?           = null,
    @SerializedName("gender"   ) var gender   : String?           = null,
    @SerializedName("origin"   ) var origin   : Origin?           = Origin(),
    @SerializedName("location" ) var location : Location?         = Location(),
    @SerializedName("image"    ) var image    : String?           = null,
    @SerializedName("episode"  ) var episode  : ArrayList<String> = arrayListOf(),
    @SerializedName("url"      ) var url      : String?           = null,
    @SerializedName("created"  ) var created  : String?           = null
)

data class Origin (
    @SerializedName("name" ) var name : String? = null,
    @SerializedName("url"  ) var url  : String? = null
)

data class Location (
    @SerializedName("name" ) var name : String? = null,
    @SerializedName("url"  ) var url  : String? = null
)