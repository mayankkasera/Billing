package com.mayankkasera.billing.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mayankkasera.billing.pojo.Sale


@TypeConverters(Sale.ItemConverter::class)
@Database(entities = [Sale::class], version = 1,exportSchema = false)
abstract class LocalDataBase: RoomDatabase() {

}