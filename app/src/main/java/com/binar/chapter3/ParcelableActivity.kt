package com.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter3.databinding.ActivityParcelableBinding
import com.binar.chapter3.databinding.ActivitySerializableBinding
import com.binar.chapter3.model.People

class ParcelableActivity : AppCompatActivity() {
    private lateinit var parcel: ActivityParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parcel = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(parcel.root)
        intentParcelable()
    }

    private fun intentParcelable() {
        val nameFour = intent.extras?.get("DATA_OBJECT_PARCELABLE") as People
        parcel.tvParcelable.text = nameFour.name
    }
}