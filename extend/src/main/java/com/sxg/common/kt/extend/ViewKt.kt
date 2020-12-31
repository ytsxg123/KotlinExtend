package com.sxg.common.kt.extend

import android.view.View

/**
 * 隐藏View
 */
fun View.toGone() {
    visibility = View.GONE
}

/**
 * 显示View
 */
fun View.toVisibility() {
    visibility = View.VISIBLE
}

/**
 * 隐藏并且占位View
 */
fun View.toInvisible() {
    visibility = View.INVISIBLE
}

/**
 * 状态是否是[View.VISIBLE]
 * @return true 是当前状态
 */
fun View.isVisibility(): Boolean {
    return visibility == View.VISIBLE
}

/**
 * 状态是否是[View.GONE]
 * @return true 是当前状态
 */
fun View.isGone(): Boolean {
    return visibility == View.GONE
}

/**
 * 状态是否是[View.INVISIBLE]
 * @return true 是当前状态
 */
fun View.isInvisible(): Boolean {
    return visibility == View.INVISIBLE
}
