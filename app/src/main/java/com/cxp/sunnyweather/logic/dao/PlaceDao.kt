package com.cxp.sunnyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.cxp.sunnyweather.SunnyWeatherApplication
import com.cxp.sunnyweather.logic.model.Place
import com.google.gson.Gson

/**
 * 文 件 名: PlaceDao
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 23:05
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
object PlaceDao {
    fun savePlaceDao(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavePlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}