package com.example.displaycontactimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class DisplayRvContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dispaly_rv_contact)

        val etName = findViewById<TextView>(R.id.etName)
        val etEmail = findViewById<TextView>(R.id.etEmail)
        val etPhone = findViewById<TextView>(R.id.etPhone)
        val imgUrl = findViewById<ImageView>(R.id.ImgUrl)

        var nameIntent=intent.getStringExtra("Name")
        var emailIntent=intent.getStringExtra("Email")
        var phoneIntent=intent.getStringExtra("Phone")
        var imageUrl=intent.getStringExtra("imageUrl")
        Picasso.get().load(imageUrl).into(imgUrl)


        etName.text=nameIntent
        etEmail.text=emailIntent
        etPhone.text=phoneIntent



    }


}