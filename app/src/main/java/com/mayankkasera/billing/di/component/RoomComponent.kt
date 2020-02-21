package com.mayankkasera.billing.di.component

import android.content.Context
import com.mayankkasera.billing.data.RoomDatabaseHelper
import com.mayankkasera.billing.di.modules.RoomModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RoomModule::class])
interface RoomComponent {

    fun inject(roomDatabaseHelper: RoomDatabaseHelper)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): RoomComponent
    }

}