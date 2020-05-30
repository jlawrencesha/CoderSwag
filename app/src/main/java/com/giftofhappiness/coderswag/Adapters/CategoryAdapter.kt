package com.giftofhappiness.coderswag.Adapters

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.giftofhappiness.coderswag.Model.Category
import com.giftofhappiness.coderswag.R

class CategoryAdapter(context: Context, categories:List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
        val categoryImage :ImageView = categoryView.findViewById(R.id.categoryimage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryname)
        println("Heavy Computing")

        val category = categories[position]


        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        categoryName.text = category.title
        return categoryView



    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
      return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}