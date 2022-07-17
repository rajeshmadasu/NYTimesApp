package com.assignment.di

import com.assignment.NYNewsApp
import com.assignment.di.module.activity.ActivityModule
import com.assignment.di.module.application.*
import com.assignment.di.module.fragment.FragmentModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ApiModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        FragmentModule::class,
        RepositoryModule::class,
        UrlModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<NYNewsApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<NYNewsApp>()
}