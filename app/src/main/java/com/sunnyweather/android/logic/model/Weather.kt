package com.sunnyweather.android.logic.model

data class Weather(val realtime: RealtimeResponse.Realtime, val dailyResponse: DailyResponse.Daily)