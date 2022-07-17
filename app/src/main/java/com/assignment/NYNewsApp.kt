package com.assignment

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber
import com.assignment.di.DaggerApplicationComponent

/**
 * author : Rajesh Madasu
 */
class NYNewsApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}