package com.example.btnrecycler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.btnrecycler.R
import com.example.btnrecycler.adapter.PopularAdapter
import com.example.btnrecycler.model.Popular
import kotlinx.android.synthetic.main.fragment_popular.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root=inflater.inflate(R.layout.fragment_popular, container, false)
        val popularProducts=ArrayList<Popular>()
        popularProducts.add(Popular(true,true,"30% off","Iphone 6 S","Apple","2100000KS","2680000KS",true,R.drawable.popular_iphone))
        popularProducts.add(Popular(true,true,"34% off","GhostBed 11 Inch Cooling Gel Memory Foam....","GhostBed","325000KS","495000KS",true,R.drawable.ghost_bed))
        popularProducts.add(Popular(false,false,"50% off","Nintendo Switch - Neon Blue and Red Joy-Con","Nintendo","359000KS","",true,R.drawable.nitendo_switch))
        popularProducts.add(Popular(true,false,"50% off","BELAROI Womens Comfy Swing Tunic Short....","Belaroi","18990KS","",false,R.drawable.belaroi))

        val adapter=PopularAdapter(popularProducts)
        root.recyclerPopular.layoutManager= LinearLayoutManager(context)
        root.recyclerPopular.adapter=adapter
        return root
    }

}
