package com.dicoding.wanderlustindo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val wisata =  intent.getParcelableExtra<Wisata>(MainActivity.INTENT_PARCELABLE)

        val photo = findViewById<ImageView>(R.id.img_item_photo)
        val description = findViewById<TextView>(R.id.tv_item_description)
        val name = findViewById<TextView>(R.id.tv_item_name)

        photo.setImageResource(wisata?.photo!!)
        name.text = wisata.name
        description.text = wisata.description
    }
}