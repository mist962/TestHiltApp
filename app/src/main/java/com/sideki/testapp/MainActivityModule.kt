package com.sideki.testapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named

@Module
@InstallIn(ApplicationComponent::class)
object MainActivityModule {

    @Provides
    @Named("String1")
    fun provideString1() = "String1 который мы проводим"

}