package com.giftofhappiness.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.giftofhappiness.coderswag.Adapters.ProductsAdapter
import com.giftofhappiness.coderswag.R
import com.giftofhappiness.coderswag.Services.DataService
import com.giftofhappiness.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

       // intent.getStringExtra(EXTRA_CATEGORY)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter


    }
}