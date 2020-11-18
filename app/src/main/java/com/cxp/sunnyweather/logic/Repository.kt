package com.cxp.sunnyweather.logic

import androidx.lifecycle.liveData
import com.cxp.sunnyweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException


/**
 * 文 件 名: Repository
 * 创 建 人: CXP
 * 创建日期: 2020-11-18 23:53
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
        emit(result)
    }

}