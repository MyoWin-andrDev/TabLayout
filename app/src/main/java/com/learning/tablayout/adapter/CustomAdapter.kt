package com.learning.tablayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.learning.tablayout.databinding.ListItemTablayoutBinding
import com.learning.tablayout.model.EntityModel

class CustomAdapter(private val customList : List<EntityModel>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding : ListItemTablayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =  CustomViewHolder(ListItemTablayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = customList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.apply {
            val item = customList[position]
            tvName.text = item.name
            tvDescription.text = item.description
            Glide.with(root.context)
                .load(item.image)
                .thumbnail(0.1f)
                .into(ivImage)
        }
    }
}