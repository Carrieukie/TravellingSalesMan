package com.karis.travellingsalesman.data.network.api

import com.karis.travellingsalesman.data.network.models.requests.GetPolyLineRequest
import com.karis.travellingsalesman.data.network.models.responses.GetPolylineResponse
import retrofit2.http.Body
import retrofit2.http.GET

interface RoutesApiService {
    @GET("directions/v2:computeRoutes")
    fun getPolyline(
        @Body getPolyLineRequest: GetPolyLineRequest
    ): GetPolylineResponse
}
