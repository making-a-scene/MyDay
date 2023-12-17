package com.example.myday.food

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myday.food.tabview.BreakfastFragment
import com.example.myday.food.tabview.DinnerFragment
import com.example.myday.food.tabview.LunchFragment

class NutritionViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BreakfastFragment()
            1 -> LunchFragment()
            else -> DinnerFragment()
        }
    }
}