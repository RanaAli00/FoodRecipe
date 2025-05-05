package com.food.recipe

import android.app.Application
import com.food.recipe.di.SharedModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
         androidContext(applicationContext)
          modules(SharedModule)
        }
    }
}