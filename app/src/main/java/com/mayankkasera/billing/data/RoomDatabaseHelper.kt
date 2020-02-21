package com.mayankkasera.billing.data

import com.mayankkasera.billing.room.LocalDataBase
import com.mayankkasera.billing.utils.App
import javax.inject.Inject

class RoomDatabaseHelper {

    init {
        App.roomComponent()?.inject(this)
    }

    @Inject
    lateinit var localeDataBase: LocalDataBase
}