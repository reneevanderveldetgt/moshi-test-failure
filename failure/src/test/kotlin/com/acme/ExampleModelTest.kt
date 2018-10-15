package com.acme

import com.squareup.moshi.Moshi
import org.junit.Assert.*
import org.junit.Test
import java.util.*

class ExampleModelTest {
    private val moshiAdapter = Moshi.Builder().build().adapter(ExampleModel::class.java)

    @Test fun toJson() {
        moshiAdapter.toJson(ExampleModel("test"))
    }
}
