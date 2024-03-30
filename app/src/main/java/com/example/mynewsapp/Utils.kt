package com.example.mynewsapp

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale

class Utils {

    companion object {
        const val API_KEY = "b4f859d0b6484764af0d93a8711668ed"
        const val BASE_URL = "https://newsapi.org"



        fun DateFormat(oldstringDate: String?): String? {
            val newDate: String?
            val dateFormat = SimpleDateFormat("E, d MMM yyyy", Locale(getCountry()))
            newDate = try {
                val date = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(oldstringDate)
                dateFormat.format(date)
            } catch (e: ParseException) {
                e.printStackTrace()
                oldstringDate
            }
            return newDate
        }

        fun getCountry(): String {
            val locale = Locale.getDefault()
            val country = java.lang.String.valueOf(locale.country)
            return country.lowercase(Locale.getDefault())
        }


    }

}