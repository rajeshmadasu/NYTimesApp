package com.assignment.di.module.application

import com.assignment.data.datasource.remote.api.INewsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * author : Rajesh Madasu
 */
@Module(includes = [RetrofitModule::class])
class ApiModule {
    @Provides
    @Singleton
    fun providePopularApi(retrofit: Retrofit): INewsApi {
        return retrofit.create(INewsApi::class.java)
    }
}