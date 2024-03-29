package com.bryanollivie.sdk.data.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookResultsResponse(
    @Json(name = "book_details")
    val bookDetailResponses: List<BookDetailsResponse>
)