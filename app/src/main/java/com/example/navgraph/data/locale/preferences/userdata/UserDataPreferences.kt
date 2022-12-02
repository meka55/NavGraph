package com.example.navgraph.data.locale.preferences.userdata

import com.example.navgraph.data.locale.preferences.PreferencesConstants
import com.example.navgraph.data.locale.preferences.PreferencesHelper

class UserDataPreferences (
    private val preferences: PreferencesHelper
) {
    var isAuthorized: Boolean
        get() = preferences().getBoolean(
            PreferencesConstants.PREF_IS_AUTHORISED, false

        )
        set(value) = preferences()
            .edit().putBoolean(
                PreferencesConstants.PREF_IS_AUTHORISED, value
            ).apply()
}