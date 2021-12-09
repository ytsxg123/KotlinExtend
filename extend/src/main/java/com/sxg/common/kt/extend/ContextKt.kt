package com.sxg.common.kt.extend

import android.content.Context
import android.net.ConnectivityManager
import android.telephony.TelephonyManager

/**
 * @return [TelephonyManager]
 */
fun Context.telephoneManager(): TelephonyManager {
    return getApplicationService(Context.TELEPHONY_SERVICE) as TelephonyManager
}

/**
 * @return [connectivityManager]
 */
fun Context.connectivityManager(): ConnectivityManager {
    return getApplicationService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
}

private fun Context.getApplicationService(name: String): Any {
    return applicationContext.getSystemService(name)
}