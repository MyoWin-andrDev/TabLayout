package com.learning.tablayout.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.learning.tablayout.R
import com.learning.tablayout.databinding.ActivityMainBinding
import com.learning.tablayout.fragment.AnimalsFragment
import com.learning.tablayout.fragment.PlanetsFragment
import com.learning.tablayout.fragment.PlantsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(PlantsFragment())

        setupTabListener()
    }

    private fun setupTabListener() = with(binding.tlMain) {
        addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val selectedFragment = when (tab?.position) {
                    0 -> PlantsFragment()
                    1 -> AnimalsFragment()
                    2 -> PlanetsFragment()
                    else -> null
                }
                selectedFragment?.let { replaceFragment(it) }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcMain, fragment)
            .addToBackStack(null)
            .commit()
    }
}
