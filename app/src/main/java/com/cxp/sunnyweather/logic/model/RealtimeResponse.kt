package com.cxp.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 文 件 名: RealtimeResponse
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 20:59
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}

