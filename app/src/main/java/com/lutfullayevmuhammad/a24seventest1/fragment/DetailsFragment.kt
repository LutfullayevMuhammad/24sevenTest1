package com.lutfullayevmuhammad.a24seventest1.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.lutfullayevmuhammad.a24seventest1.R
import com.lutfullayevmuhammad.a24seventest1.adapter.MahsulotAdapter
import com.lutfullayevmuhammad.a24seventest1.databinding.FragmentDetailsBinding
import com.lutfullayevmuhammad.a24seventest1.fragment.base.BaseFragment
import com.lutfullayevmuhammad.a24seventest1.models.MahsulotData
import com.lutfullayevmuhammad.a24seventest1.utils.VerticalItemDecoration
import kotlin.math.roundToInt

class DetailsFragment : BaseFragment() {

    lateinit var binding: FragmentDetailsBinding

    private var adapter = MahsulotAdapter()

    override fun getLayout(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onFragmentReady() {
        val size = resources.getDimension(R.dimen._10db)
        val decoration = VerticalItemDecoration(size.roundToInt())
        binding.mahsulotList.addItemDecoration(decoration)

        binding.mahsulotList.adapter = adapter
        binding.mahsulotList.layoutManager = LinearLayoutManager(requireContext())

        adapter.data = mahsulotData()

        binding.backBtn.setOnClickListener {
            requireActivity().onBackPressed()
        }

    }

    override fun onFragmentCreated() {

    }

    override fun onFragmentClosed() {

    }

    fun mahsulotData(): ArrayList<MahsulotData> {
        return arrayListOf(
            MahsulotData(
                "Яблочный сок 'Моя семья', 1л",
                "5.0 x 17 000",
                "85 000 сум"
            ),
            MahsulotData(
                "Яблоко '4 йулдуз', кг",
                "4.5 x 17 000",
                "76 500 сум"
            ),
            MahsulotData(
                "Яблочный сок 'Моя семья', 1л",
                "5.0 x 17 000",
                "85 000 сум"
            ),
            MahsulotData(
                "Яблоко '4 йулдуз', кг",
                "4.5 x 17 000",
                "76 500 сум"
            ),
            MahsulotData(
               "Яблочный сок 'Моя семья', 1л",
                "5.0 x 17 000",
                "85 000 сум"
            ),
            MahsulotData(
                "Яблоко '4 йулдуз', кг",
                "4.5 x 17 000",
                "76 500 сум"
            )
        )
    }

}