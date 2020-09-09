package com.redskill.flickrbrowser

import androidx.appcompat.app.AppCompatActivity

private const val TAG = "BaseActivity"
internal const val FLICK_QUERY = "FLICK_QUERY"
internal const val PHOTO_TRANSFER = "PHOTO_TRANSFER"

open class BaseActivity : AppCompatActivity() {

    internal fun activateToolbar(enableHome: Boolean) {
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(enableHome)
    }
}