package com.wifitransferfile.android.transferproto.broadcastconn


sealed class BroadcastReceiverState {
    data object NoConnection : BroadcastReceiverState()

    data object Requesting : BroadcastReceiverState()

    data object Active : BroadcastReceiverState()
}