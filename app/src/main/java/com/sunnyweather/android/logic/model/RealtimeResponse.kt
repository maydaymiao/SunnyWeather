package com.sunnyweather.android.logic.model
import com.google.gson.annotations.SerializedName

//把所有数据模型定义在RealtimeResponse内部，防止出现和其他接口数据类型类名冲突问题
//显示：温度、晴、AQI

data class RealtimeResponse(
    @SerializedName("result")
    val result: Result,
    @SerializedName("status")
    val status: String,
){
    data class Result(
        @SerializedName("realtime")
        val realtime: Realtime
    )

    data class Realtime(
        @SerializedName("air_quality")
        val airQuality: AirQuality,
        @SerializedName("skycon")
        val skycon: String,
        @SerializedName("temperature")
        val temperature: Float
    )

    data class AirQuality(
        @SerializedName("aqi")
        val aqi: Aqi
    )

    data class Aqi(
        @SerializedName("chn")
        val chn: Float,
        @SerializedName("usa")
        val usa: Float
    )
}
/*
{
    "status": "ok",
    "location": [
    25.1552,
    121.6544
    ],
    "result": {
    "realtime": {
    "status": "ok",
    "temperature": 28,
    "humidity": 0.65,
    "cloudrate": 0.78,
    "skycon": "PARTLY_CLOUDY_DAY",
    "visibility": 22.67,
    "dswrf": 469.7,
    "wind": {
    "speed": 6.78,
    "direction": 327.81
},
    "pressure": 99535.22,
    "apparent_temperature": 30.1,
    "precipitation": {
    "local": {
    "status": "ok",
    "datasource": "radar",
    "intensity": 0
},
    "nearest": {
    "status": "ok",
    "distance": 15,
    "intensity": 2
}
},
    "air_quality": {
    "pm25": 6,
    "pm10": 0,
    "o3": 0,
    "so2": 0,
    "no2": 0,
    "co": 0,
    "aqi": {
    "chn": 10,
    "usa": 0
},
    "description": {
    "usa": "",
    "chn": "优"
}
},
    "life_index": {
    "ultraviolet": {
    "index": 2,
    "desc": "很弱"
},
    "comfort": {
    "index": 3,
    "desc": "热"
}
}
},
    "primary": 0
}
}
 */