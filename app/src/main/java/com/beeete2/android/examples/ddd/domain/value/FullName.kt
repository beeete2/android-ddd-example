package com.beeete2.android.examples.ddd.domain.value

import java.util.*

data class FullName(
    val firstName: PlainName,
    val lastName: PlainName
) {
    fun locallyName(locale: Locale): PlainName {
        TODO("not implement")
    }
}
