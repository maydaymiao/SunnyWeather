package com.sunnyweather.android.logic.model
import com.google.gson.annotations.SerializedName
import java.util.*

//把所有数据模型定义在RealtimeResponse内部，防止出现和其他接口数据类型类名冲突问题

data class DailyResponse(
    @SerializedName("result")
    val result: Result,
    @SerializedName("status")
    val status: String
){
    data class Result(
        @SerializedName("daily")
        val daily: Daily
    )

    data class Daily(
        @SerializedName("life_index")
        val lifeIndex: LifeIndex,
        @SerializedName("skycon")
        val skycon: List<Skycon>,
        @SerializedName("temperature")
        val temperature: List<Temperature>
    )

    data class LifeIndex(
        val coldRisk: List<LifeDescription>,
        @SerializedName("carWashing")
        val carWashing: List<LifeDescription>,
        @SerializedName("comfort")
        val comfort: List<LifeDescription>,
        @SerializedName("dressing")
        val dressing: List<LifeDescription>,
        @SerializedName("ultraviolet")
        val ultraviolet: List<LifeDescription>
    )

    data class Skycon(
        @SerializedName("date")
        val date: Date,
        @SerializedName("value")
        val value: String
    )

    data class Temperature(
        @SerializedName("max")
        val max: Double,
        @SerializedName("min")
        val min: Double
    )


    data class LifeDescription(
        @SerializedName("desc")
        val desc: String,
    )
}

