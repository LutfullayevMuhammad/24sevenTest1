package com.lutfullayevmuhammad.a24seventest1.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lutfullayevmuhammad.a24seventest1.databinding.MahsulotItemBinding
import com.lutfullayevmuhammad.a24seventest1.models.MahsulotData

class MahsulotAdapter : RecyclerView.Adapter<MahsulotAdapterHolder>() {

    var data = ArrayList<MahsulotData>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahsulotAdapterHolder =
        MahsulotAdapterHolder(
            MahsulotItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MahsulotAdapterHolder, position: Int) =
        holder.bindData(data[position])

    override fun getItemCount(): Int = data.size

}