package com.wifitransferfile.android.transferproto.fileexplore.model

import androidx.annotation.Keep
import com.squareup.moshi.JsonClass

@Keep
@JsonClass(generateAdapter = true)
data class HandshakeResp(
    val fileSeparator: String
)
