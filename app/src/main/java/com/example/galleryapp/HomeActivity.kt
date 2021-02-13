package com.example.galleryapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.android.volley.toolbox.Volley
import com.example.galleryapp.favourite.FavouriteFragment
import com.example.galleryapp.photos.PhotoFragment
import com.example.galleryapp.videos.VideoFragment
import com.example.galleryapp.viewmodel.HomeViewModel
import com.google.android.material.tabs.TabLayout
import kotlin.concurrent.fixedRateTimer

class HomeActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var layout:RelativeLayout?=null
    private lateinit var homeViewModel: HomeViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        tabLayout = findViewById<TabLayout>(R.id.tlTabs)
        viewPager = findViewById<ViewPager>(R.id.viewPager)
        layout = findViewById<RelativeLayout>(R.id.header)

        homeViewModel =  ViewModelProviders.of(this).get(HomeViewModel::class.java)
        homeViewModel.getBannerImage(this)


        setUpTabs()


    }

    private fun setUpTabs() {
        val homeViewpagerAdapter = ViewPagerAdapter(supportFragmentManager)
        homeViewpagerAdapter.addFragment(
            PhotoFragment(),
            getString(R.string.photo)
        )
        homeViewpagerAdapter.addFragment(
            VideoFragment(),
            getString(R.string.videos)
        )
        homeViewpagerAdapter.addFragment(
            FavouriteFragment(),getString(R.string.favourite))

        viewPager?.adapter = homeViewpagerAdapter;
        tabLayout?.setupWithViewPager(viewPager)

    }


}