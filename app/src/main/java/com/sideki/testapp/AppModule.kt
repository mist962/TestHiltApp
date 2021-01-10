package com.sideki.testapp

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Provides
    @Named("String2")
    fun provideString2(
        @ApplicationContext context: Context,
        @Named("String1") string1: String) =
        "$string1 + ${context.getString(R.string.string2_for_provide)}"
}