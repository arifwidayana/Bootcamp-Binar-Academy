package com.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter3.databinding.ActivitySecondScreenBinding
import com.binar.chapter3.databinding.ActivitySerializableBinding
import com.binar.chapter3.model.People

class SerializableActivity : AppCompatActivity() {
    private lateinit var serial: ActivitySerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        serial = ActivitySerializableBinding.inflate(layoutInflater)
        setContentView(serial.root)
        intentSerializable()
    }

    private fun intentSerializable() {
        val nameThree = intent.extras?.get("DATA_OBJECT_SERIALIZABLE") as People
        serial.tvSerializable.text = nameThree.name
    }
}