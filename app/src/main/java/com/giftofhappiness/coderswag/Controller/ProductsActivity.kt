package com.giftofhappiness.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giftofhappiness.coderswag.R
import com.giftofhappiness.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

       // intent.getStringExtra(EXTRA_CATEGORY)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}