package com.learning.tablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.tablayout.R
import com.learning.tablayout.adapter.CustomAdapter
import com.learning.tablayout.databinding.FragmentPlanetsBinding
import com.learning.tablayout.model.CustomList

class PlanetsFragment : Fragment(R.layout.fragment_planets) {
    private lateinit var binding : FragmentPlanetsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentPlanetsBinding.bind(view)
        val planetList = listOf(
            CustomList(
                name = "Mercury",
                description = "The smallest planet in our solar system and closest to the Sun. Surface temperatures vary from -173°C to 427°C.",
                image = R.drawable.img_mercury
            ),
            CustomList(
                name = "Venus",
                description = "Similar in size to Earth but with a toxic atmosphere of carbon dioxide and clouds of sulfuric acid.",
                image = R.drawable.img_venus
            ),
            CustomList(
                name = "Earth",
                description = "Our home planet, the only known place in the universe confirmed to host life with liquid water on the surface.",
                image = R.drawable.img_earth
            ),
            CustomList(
                name = "Mars",
                description = "Known as the Red Planet due to iron oxide on its surface. Has the largest volcano and canyon in the solar system.",
                image = R.drawable.img_mars
            ),
            CustomList(
                name = "Jupiter",
                description = "The largest planet - a gas giant with a Great Red Spot storm that has raged for hundreds of years.",
                image = R.drawable.img_jupitar
            ),
            CustomList(
                name = "Saturn",
                description = "Famous for its spectacular ring system made of ice and rock particles. Has at least 82 moons.",
                image = R.drawable.img_saturn
            ))
        binding.rvPlanet.adapter = CustomAdapter(planetList)

        super.onViewCreated(view, savedInstanceState)
    }
}