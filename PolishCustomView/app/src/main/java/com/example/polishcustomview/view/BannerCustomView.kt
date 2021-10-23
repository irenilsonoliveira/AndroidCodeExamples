package com.example.polishcustomview.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import com.example.polishcustomview.R

class BannerCustomView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyleAttr: Int = 0
) : FrameLayout(context) {
    init {
        initView()
    }

    private fun initView() {
        LayoutInflater.from(context).inflate(
            R.layout.banner_custom_view,
            this,
            true
        )

        loadAttrs()
    }

    private fun loadAttrs() {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.BannerCustomView,
            defStyleAttr,
            defStyleAttr
        ).apply {
            try {
                val title = getString(R.styleable.BannerCustomView_title)
                findViewById<TextView>(R.id.banner_title).text = title
            } finally {
                recycle()
            }
        }
    }
}