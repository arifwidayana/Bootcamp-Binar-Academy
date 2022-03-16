package com.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Parcelable
import com.binar.chapter3.databinding.ActivityMainBinding
import com.binar.chapter3.model.People
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intentActivity()
        intentBundle()
        intentSerializable()
        intentParcelable()
    }

    private fun intentActivity() {
        binding.btnActivity.setOnClickListener{
            val intent = Intent(this, SecondScreen::class.java)
            intent.putExtra("nameOne","ari")
            startActivity(intent)
        }
    }

    private fun intentBundle() {
        binding.btnBundle.setOnClickListener{
            val intent = Intent(this, SecondScreen::class.java)
            val bundle = Bundle()
            bundle.putString("nameTwo","arrai")
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    private fun intentSerializable() {
        binding.btnSerializable.setOnClickListener{
            val intent = Intent(this, SerializableActivity::class.java)
            val person = People("ara ara")
            intent.putExtra("DATA_OBJECT_SERIALIZABLE", person as Serializable)
            startActivity(intent)
        }
    }

    private fun intentParcelable() {
        binding.btnParcelable.setOnClickListener{
            val intent = Intent(this, ParcelableActivity::class.java)
            val person = People("ari ari")
            intent.putExtra("DATA_OBJECT_PARCELABLE", person as Parcelable)
            startActivity(intent)
        }
    }
}