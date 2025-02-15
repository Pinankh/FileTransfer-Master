package com.wifitransferfile.android.transferproto

interface SimpleCallback<T> {

    fun onError(errorMsg: String) {}

    fun onSuccess(data: T) {}
}