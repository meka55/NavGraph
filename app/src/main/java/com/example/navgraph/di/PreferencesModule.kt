package com.example.navgraph.di

import android.content.Context
import com.example.navgraph.data.locale.preferences.PreferencesHelper
import com.example.navgraph.data.locale.preferences.userdata.UserDataPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PreferencesModule {

    @Singleton
    @Provides
    fun providePreferencesHelper(@ApplicationContext context: Context):PreferencesHelper =
        PreferencesHelper(context)

    @Singleton
    @Provides
    fun provideUserPreferencesData(preferencesHelper: PreferencesHelper) =
        UserDataPreferences(preferencesHelper)
}