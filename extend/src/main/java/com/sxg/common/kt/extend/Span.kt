package com.sxg.common.kt.extend

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.text.style.StyleSpan
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.sxg.common.kt.inner.ImageSpanInner

fun boldSpanOf(): Any {
    return StyleSpan(Typeface.BOLD)
}

fun boldItalicSpanOf(): Any {
    return StyleSpan(Typeface.BOLD_ITALIC)
}

fun italicSpanOf(): Any {
    return StyleSpan(Typeface.ITALIC)
}

fun bitmapSpanOf(bitmap: Bitmap?, context: Context? = null, width: Int = -1, height: Int = -1, useDefIntrinsic: Boolean = false): Any {
    return if (context == null) {
        drawableSpanOf(BitmapDrawable(bitmap), width, height, useDefIntrinsic)
    } else {
        drawableSpanOf(BitmapDrawable(context.resources, bitmap), width, height, useDefIntrinsic)
    }
}

@Throws(NullPointerException::class)
fun drawableResourcesOf(@DrawableRes resId: Int, context: Context, width: Int = -1, height: Int = -1, useDefIntrinsic: Boolean = false): Any {
    val drawable = ContextCompat.getDrawable(context, resId)!!
    return drawableSpanOf(drawable, width, height, useDefIntrinsic)
}

/**
 * 获取一个ImageSpan
 * @param width drawable 测量大小
 * @param height drawable 测量大小
 * @param useDefIntrinsic 是否用drawable默认大小
 */
private fun drawableSpanOf(drawable: Drawable, width: Int = -1, height: Int = -1, useDefIntrinsic: Boolean = false): Any {
    if (useDefIntrinsic) {
        drawable.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
    } else {
        if (width > -1 && height > -1) {
            drawable.setBounds(0, 0, width, height)
        }
    }
    return ImageSpanInner(drawable)
}