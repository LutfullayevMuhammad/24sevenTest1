package com.lutfullayevmuhammad.a24seventest1.adapter

import androidx.recyclerview.widget.RecyclerView
import com.lutfullayevmuhammad.a24seventest1.databinding.MahsulotItemBinding
import com.lutfullayevmuhammad.a24seventest1.models.MahsulotData

class MahsulotAdapterHolder(val binding: MahsulotItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindData(data: MahsulotData) {
        binding.mahsulotName.text = data.mahsulotName
        binding.mahsulotHajmi.text = data.mahsulotHajmi
        binding.mahsulotNarxi.text = data.mahsulotNarxi
    }

}