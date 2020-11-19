package com.cxp.sunnyweather.logic.network

import com.cxp.sunnyweather.SunnyWeatherApplication
import com.cxp.sunnyweather.logic.model.DailyResponse
import com.cxp.sunnyweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * 文 件 名: WeatherService
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 21:13
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
interface WeatherService {

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng:String,@Path("lat") lat:String):Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String,@Path("lat") lat: String):Call<DailyResponse>
}