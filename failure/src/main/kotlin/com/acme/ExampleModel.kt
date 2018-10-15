package com.acme

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExampleModel(val id: String)

