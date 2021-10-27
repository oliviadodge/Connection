package com.develop.connection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.develop.connection.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentMainBinding.inflate(inflater, container, false).also {
            bindViews(it)
            return it.root
        }
    }

    private fun bindViews(binding: FragmentMainBinding) {
//        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar) TODO fix?
        setupBottomNav(binding.bottomNavigation)
    }

    private fun setupBottomNav(bottomNavigation: BottomNavigationView) {
        val bottomNavHostFragment = childFragmentManager.findFragmentById(R.id.nav_host_with_bottom_nav) as NavHostFragment
        val navController = bottomNavHostFragment.navController
        bottomNavigation.setupWithNavController(navController)
    }
}
