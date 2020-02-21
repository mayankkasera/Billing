package com.mayankkasera.billing.di.modules

import android.content.Context
import androidx.room.Room
import com.mayankkasera.billing.R
import com.mayankkasera.billing.room.LocalDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {
    @Provides
    @Singleton
    fun getLocaleDataBase(context: Context) : LocalDataBase {
        return Room.databaseBuilder(context.applicationContext,
            LocalDataBase::class.java, context.resources.getString(R.string.app_name))
            .allowMainThreadQueries()
            .build()
    }
}