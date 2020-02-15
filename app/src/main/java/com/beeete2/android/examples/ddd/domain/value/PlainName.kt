package com.beeete2.android.examples.ddd.domain.value

import java.lang.IllegalArgumentException

data class PlainName(val value: String) {
    init {
        if (value.isEmpty()) {
            throw IllegalArgumentException("1文字以上指定してください。")
        }
    }
}
