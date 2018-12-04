package com.kuldeepr.user.toastlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    companion object {

        public fun S(c: Context, message:String){
            Toast.makeText(c,message,Toast.LENGTH_LONG).show()
        }
    }
}