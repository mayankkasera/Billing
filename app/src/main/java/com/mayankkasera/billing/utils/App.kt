package com.mayankkasera.billing.utils

import android.app.Application
import com.facebook.stetho.Stetho
import com.mayankkasera.billing.di.component.DaggerRoomComponent
import com.mayankkasera.billing.di.component.RoomComponent

class App : Application()   {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        roomComponent = DaggerRoomComponent.factory().create(applicationContext)
    }

    companion object {

        private var roomComponent: RoomComponent? = null

        fun roomComponent(): RoomComponent? {
            return roomComponent
        }

    }

}