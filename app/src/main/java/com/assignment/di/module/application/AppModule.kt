package com.assignment.di.module.application

import android.content.Context
import com.assignment.NYNewsApp
import com.assignment.di.qualifier.ApplicationContext
import dagger.Binds
import dagger.Module
/**
 * author : Rajesh Madasu
 */
@SuppressWarnings
@Module
abstract class AppModule {

    @ApplicationContext
    @Binds
    abstract fun provideApplicationContext(application: NYNewsApp): Context

}