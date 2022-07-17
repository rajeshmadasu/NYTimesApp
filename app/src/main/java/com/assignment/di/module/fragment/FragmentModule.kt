package com.assignment.di.module.fragment

import com.assignment.ui.fragments.detail.DetailFragment
import com.assignment.ui.fragments.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * author : Rajesh Madasu
 */
@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment?
    @ContributesAndroidInjector
    abstract fun contributeDetailFragment(): DetailFragment?
}