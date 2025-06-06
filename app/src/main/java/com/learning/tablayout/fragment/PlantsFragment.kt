package com.learning.tablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.tablayout.R
import com.learning.tablayout.databinding.FragmentPlantsBinding
import com.learning.tablayout.adapter.CustomAdapter
import com.learning.tablayout.model.EntityModel

class PlantsFragment : Fragment(R.layout.fragment_plants) {
    private lateinit var binding : FragmentPlantsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPlantsBinding.bind(view)
        val plantList = listOf(
            EntityModel(
                name = "Rose",
                description = "The rose is a classic symbol of love and beauty. With over 300 species, they come in various colors, each with its own meaning.",
                image = R.drawable.img_rose
            ),
            EntityModel(
                name = "Sunflower",
                description = "Sunflowers are known for their bright yellow petals and ability to turn towards the sun. They symbolize adoration and loyalty.",
                image = R.drawable.img_sunflower
            ),
            EntityModel(
                name = "Tulip",
                description = "Tulips are elegant spring flowers available in many colors. They're associated with perfect love and fame.",
                image = R.drawable.img_tulip
            ),
            EntityModel(
                name = "Lavender",
                description = "Famous for its soothing fragrance, lavender has purple flowers and is widely used in aromatherapy and herbal remedies.",
                image = R.drawable.img_lavender
            ),
            EntityModel(
                name = "Orchid",
                description = "Exotic and sophisticated, orchids are one of the largest flowering plant families with over 28,000 species worldwide.",
                image = R.drawable.img_orchid
            )
        )
        binding.rvPlant.adapter = CustomAdapter(plantList)

    }
}