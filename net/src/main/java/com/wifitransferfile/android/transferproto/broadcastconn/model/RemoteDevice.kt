package com.wifitransferfile.android.transferproto.broadcastconn.model

import java.net.InetSocketAddress

data class RemoteDevice(
    val remoteAddress: InetSocketAddress,
    val deviceName: String
)