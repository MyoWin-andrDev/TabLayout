package com.learning.tablayout.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.learning.tablayout.R
import com.learning.tablayout.adapter.EntityAdapter
import com.learning.tablayout.databinding.FragmentPlanetsBinding
import com.learning.tablayout.model.EntityModel

class PlanetsFragment : Fragment(R.layout.fragment_planets) {
    private val binding by lazy { FragmentPlanetsBinding.bind(requireView()) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val planetList = listOf(
            EntityModel(
                name = "Mercury",
                description = "The smallest planet in our solar system and closest to the Sun. Surface temperatures vary from -173°C to 427°C.",
                image = R.drawable.img_mercury
            ),
            EntityModel(
                name = "Venus",
                description = "Similar in size to Earth but with a toxic atmosphere of carbon dioxide and clouds of sulfuric acid.",
                image = R.drawable.img_venus
            ),
            EntityModel(
                name = "Earth",
                description = "Our home planet, the only known place in the universe confirmed to host life with liquid water on the surface.",
                image = R.drawable.img_earth
            ),
            EntityModel(
                name = "Mars",
                description = "Known as the Red Planet due to iron oxide on its surface. Has the largest volcano and canyon in the solar system.",
                image = R.drawable.img_mars
            ),
            EntityModel(
                name = "Jupiter",
                description = "The largest planet - a gas giant with a Great Red Spot storm that has raged for hundreds of years.",
                image = R.drawable.img_jupitar
            ),
            EntityModel(
                name = "Saturn",
                description = "Famous for its spectacular ring system made of ice and rock particles. Has at least 82 moons.",
                image = R.drawable.img_saturn
            )
        )
        binding.rvPlanet.adapter = EntityAdapter(planetList)

    }
}