package com.learning.tablayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.tablayout.databinding.ListItemTablayoutBinding
import com.learning.tablayout.model.CustomList

class CustomAdapter(private val customList : List<CustomList>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding : ListItemTablayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =  CustomViewHolder(ListItemTablayoutBinding.inflate(LayoutInflater.from(parent.context)))

    override fun getItemCount(): Int = customList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.apply {
            tvName.text = customList[position].name
            tvDescription.text = customList[position].description
            ivImage.setImageResource(customList[position].image)
        }
    }
}