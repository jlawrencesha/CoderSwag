package com.giftofhappiness.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.giftofhappiness.coderswag.Model.Category
import com.giftofhappiness.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryimage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryname)
        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)
    }
}