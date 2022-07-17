package com.assignment.di.module.activity

import com.assignment.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * author : Rajesh Madasu
 */

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}