package com.cxp.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.net.Inet4Address

/**
 * 文 件 名: PlaceResponse
 * 创 建 人: CXP
 * 创建日期: 2020-11-18 23:31
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(
    val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)

