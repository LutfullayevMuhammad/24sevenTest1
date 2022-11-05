package com.lutfullayevmuhammad.a24seventest1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lutfullayevmuhammad.a24seventest1.databinding.FragmentHomeBinding

class HomeFragment:BaseFragment() {

    lateinit var binding:FragmentHomeBinding

    override fun getLayout(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onFragmentReady() {

    }

    override fun onFragmentCreated() {

    }

    override fun onFragmentClosed() {

    }

}