package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

//第二步
// https://api.caiyunapp.com/v2/place?query=上海&token=dGzJn6htvX8qd8qy&lang=zh_CN

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)
