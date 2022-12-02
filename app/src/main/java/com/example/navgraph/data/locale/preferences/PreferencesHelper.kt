package com.example.navgraph.data.locale.preferences

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper(context: Context) {
    private val preference: SharedPreferences =
        context.getSharedPreferences("volunteer.preference", Context.MODE_PRIVATE)

    operator fun invoke() = preference
}