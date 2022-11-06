package com.lutfullayevmuhammad.a24seventest1.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lutfullayevmuhammad.a24seventest1.databinding.FragmentHomeBinding
import com.lutfullayevmuhammad.a24seventest1.fragment.base.BaseFragment

class HomeFragment: BaseFragment() {

    lateinit var binding:FragmentHomeBinding

    override fun getLayout(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onFragmentReady() {
        binding.profilBtn.setOnClickListener {
            val action =
                HomeFragmentDirections.actionHomeFragmentToDetailsFragment()
            findNavController().navigate(action)
        }

    }

    override fun onFragmentCreated() {

    }

    override fun onFragmentClosed() {

    }

}