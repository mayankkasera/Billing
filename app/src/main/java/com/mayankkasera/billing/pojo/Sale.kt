package com.mayankkasera.billing.pojo

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import java.lang.reflect.Type
import java.util.*

@Entity
@Parcelize
@TypeConverters(Sale.ItemConverter::class)
data class Sale (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    var customerName : String? = null,
    var date : Long? = 0,
    var amount : Long? = 0,
    var totalAmount : Long? = 0,
    var list : ArrayList<Item>?
) : Parcelable {
    @Parcelize
    data class Item(
         var name : String?,
         var quantity : Int?,
         var rate : Long?,
         var totalAmount : Long?
    ) : Parcelable


    class ItemConverter{
        @TypeConverter
        fun getQA(data: String?): ArrayList<Item>? {
            val gson = Gson()
            if (data == null) {
                return arrayListOf()
            }
            val listType: Type = object : TypeToken<ArrayList<Item>?>() {}.type
            return gson.fromJson<ArrayList<Item>>(data, listType)
        }

        @TypeConverter
        fun setQA(myObjects: ArrayList<Item>?): String? {
            val gson = Gson()
            return gson.toJson(myObjects)
        }
    }

    class DateTimeConverters {
        @TypeConverter
        fun toCalendar(l: Long): Calendar? {
            val c = Calendar.getInstance()
            c.timeInMillis = l
            return c
        }

        @TypeConverter
        fun fromCalendar(c: Calendar?): Long? {
            return c?.time?.time
        }
    }

}