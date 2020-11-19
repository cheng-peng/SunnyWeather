package com.cxp.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.cxp.sunnyweather.logic.Repository
import com.cxp.sunnyweather.logic.dao.PlaceDao
import com.cxp.sunnyweather.logic.model.Place

/**
 * 文 件 名: PlaceViewModel
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 0:15
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) {
        Repository.searchPlaces(it)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getSavePlace() = Repository.getSavePlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()
}