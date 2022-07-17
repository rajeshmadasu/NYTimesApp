package com.assignment.ui.fragments.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import com.assignment.BR
import com.assignment.R
import com.assignment.databinding.MainFragmentBinding
import com.assignment.ui.base.BaseFragment
import com.assignment.ui.utils.ItemDivider


/**
 * author: Rajesh Madasu
 */
class M
class MainFragment : BaseFragment<MainFragmentBinding, MainViewModel>(R.layout.main_fragment) {

    override fun provideViewModelClass() = MainViewModel::class.java

    override val bindingVariable: Int = BR.viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true);

        viewModel.fetchNews(true,1)

        viewModel.getItemClick().observe(this) {
            val navHostFragment =
                activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            val action = MainFragmentDirections.actionMainFragmentToDetailFragment(it.url, it.title)
            navController.navigate(action)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.rvNewsItems.addItemDecoration(
            ItemDivider(
                resources.getDimensionPixelSize(R.dimen.dimen_8dp)
            )
        )
        setToolbarTitle(getString(R.string.title_main))
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        //inflate menu
        inflater.inflate(com.assignment.R.menu.main_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //handle menu item clicks
        val id: Int = item.getItemId()
        if (id == R.id.action_one_day) {
            viewModel.fetchNews(true,1)
          //  Toast.makeText(activity, "Today", Toast.LENGTH_SHORT).show()
        }
        if (id == R.id.action_last_seven_days) {
            viewModel.fetchNews(true,7)
         //   Toast.makeText(activity, "Sort", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}