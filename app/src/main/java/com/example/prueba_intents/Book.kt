package com.example.prueba_intents

import android.os.Parcel
import android.os.Parcelable

class Book() : Parcelable {
    private val titulo: String =""
    private val numpag: Int=0
    private val autor: String=""
    private val año: Int=0

    constructor(parcel: Parcel) : this() {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }
    fun gettitulo(): String{
        return titulo
    }
    fun getnumpag(): Int{
        return numpag
    }
    fun getautor(): String{
        return autor
    }
    fun getaño(): Int{
        return año
    }
}

