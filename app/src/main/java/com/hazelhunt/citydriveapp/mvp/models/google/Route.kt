package com.hazelhunt.citydriveapp.mvp.models.google

import com.google.gson.annotations.SerializedName

/**
 * Created by Nikita on 6/28/2016.
 */
class Route {

    @SerializedName("overview_polyline")
    val overviewPolyLine: OverviewPolyLine? = null

    val legs: List<Legs>? = null

}
