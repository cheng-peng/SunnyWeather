package com.cxp.sunnyweather.logic.model

/**
 * 文 件 名: Weather
 * 创 建 人: CXP
 * 创建日期: 2020-11-19 21:11
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class Weather(val realtime: RealtimeResponse.Realtime,val daily: DailyResponse.Daily)