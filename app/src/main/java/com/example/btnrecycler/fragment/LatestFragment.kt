package com.example.btnrecycler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.btnrecycler.R
import com.example.btnrecycler.adapter.LatestAdapter
import com.example.btnrecycler.model.Latest
import kotlinx.android.synthetic.main.fragment_latest.view.*

/**
 * A simple [Fragment] subclass.
 */
class LatestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_latest, container, false)
        var latestArray = ArrayList<Latest>()
        latestArray.add(Latest("Hyde Park N401015","LOUIS VUITTON","999,99999KS",true,"2,11000KS",R.drawable.lv_bag))
        latestArray.add(Latest("HORNS PINK LONG SLEEVE TSHIRT","Lady Gaga","72000KS",false,"20000",R.drawable.pink_long_shirt))
        latestArray.add(Latest("Iphone 6 S","Apple","600000KS",true,"680000KS",R.drawable.iphone))



        var b = LatestAdapter(latestArray)
        root.recyclerLatest.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        root.recyclerLatest.adapter = b
        return root
    }

}
