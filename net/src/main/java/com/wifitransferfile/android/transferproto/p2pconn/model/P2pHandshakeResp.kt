package com.wifitransferfile.android.transferproto.p2pconn.model

import androidx.annotation.Keep
import com.squareup.moshi.JsonClass

@Keep
@JsonClass(generateAdapter = true)
data class P2pHandshakeResp(
    val deviceName: String
)