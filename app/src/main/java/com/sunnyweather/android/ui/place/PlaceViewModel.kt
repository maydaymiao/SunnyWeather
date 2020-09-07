package com.sunnyweather.android.ui.place

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.Place
import com.sunnyweather.android.logic.model.PlaceResponse

class PlaceViewModel: ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()

//    对LiveData更新
    val placeLiveData = Transformations.switchMap(searchLiveData){
        query -> Repository.searchPlaces(query)
    }

//    当外部调用这个方法时，并传入location时，会改变searchLiveData的值
//    此时上面的switchMap由于观察了searchLiveData，则会被执行，并将Repository.searchPlaces(query)返回来的LiveData转换成一个可观察LiveData对象
//    对于Activity来说，只需要观察新的这个LiveData对象即可
    fun searchPlaces(query: String){
        searchLiveData.value = query
    }
}