package com.wifitransferfile.android.transferproto.qrscanconn

interface QRCodeScanObserver {

    fun onNewState(state: QRCodeScanState)
}