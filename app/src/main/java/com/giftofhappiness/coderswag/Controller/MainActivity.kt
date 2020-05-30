package com.giftofhappiness.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.giftofhappiness.coderswag.Adapters.CategoryAdapter
import com.giftofhappiness.coderswag.Model.Category
import com.giftofhappiness.coderswag.R
import com.giftofhappiness.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            adapter = CategoryAdapter(this, DataService.categories)

            categoryListView.adapter = adapter


    }
}
