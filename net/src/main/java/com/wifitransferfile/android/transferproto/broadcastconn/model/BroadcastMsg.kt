package com.wifitransferfile.android.transferproto.broadcastconn.model

import androidx.annotation.Keep
import com.squareup.moshi.JsonClass

@Keep
@JsonClass(generateAdapter = true)
data class BroadcastMsg(
    val version: Int,
    val deviceName: String
)
