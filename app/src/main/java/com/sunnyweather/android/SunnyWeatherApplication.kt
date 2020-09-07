package com.sunnyweather.android

import android.app.Application
import android.content.Context

//第一步
//由于从ViewModel层开始就不再持有Activity的引用，因此经常会出现"缺Context"的情况，所以这个类提供一种全局获取Context的方式
//在manifest里姚添加android:name

class SunnyWeatherApplication: Application() {
    companion object {
//        彩云API TOKEN
        const val TOKEN = "dGzJn6htvX8qd8qy"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}