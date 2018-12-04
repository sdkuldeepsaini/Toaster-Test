package com.kuldeepr.user.toasterexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kuldeepr.user.toastlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.S(applicationContext,"Kuldeep Library")
    }
}
