package com.learning.tablayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.tablayout.databinding.ListItemTablayoutBinding
import com.learning.tablayout.model.EntityModel

class EntityAdapter(private val entityModel: List<EntityModel>) :
    RecyclerView.Adapter<EntityAdapter.EntityViewHolder>() {

    class EntityViewHolder(val binding: ListItemTablayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntityViewHolder =
        EntityViewHolder(ListItemTablayoutBinding.inflate(LayoutInflater.from(parent.context)))

    override fun getItemCount(): Int = entityModel.size

    override fun onBindViewHolder(holder: EntityViewHolder, position: Int) {
        holder.binding.apply {
            tvName.text = entityModel[position].name
            tvDescription.text = entityModel[position].description
            ivImage.setImageResource(entityModel[position].image)
        }
    }
}