package com.cxp.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * 文 件 名: DailyResponse
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 21:04
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class DailyResponse(val status: String, val result: Result) {

    data class Result(val daily: Daily)

    data class Daily(
        val temperature: List<Temperature>, val skycon: List<Skycon>,
        @SerializedName("life_index") val lifeIndex: LifeIndex
    )

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val value: String, val date: Date)

    data class LifeIndex(
        val coldRisk: List<LifeDescription>, val carWashing: List<LifeDescription>,
        val ultraviolet: List<LifeDescription>, val dressing: List<LifeDescription>
    )

    data class LifeDescription(val desc: String)
}