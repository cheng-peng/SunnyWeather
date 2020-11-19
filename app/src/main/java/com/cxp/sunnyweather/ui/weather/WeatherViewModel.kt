package com.cxp.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.cxp.sunnyweather.logic.Repository
import com.cxp.sunnyweather.logic.model.Location

/**
 * 文 件 名: WeatherViewModel
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 21:49
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class WeatherViewModel : ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) {
        Repository.refreshWeather(it.lng, it.lat)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }
}